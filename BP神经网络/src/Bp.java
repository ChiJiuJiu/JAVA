/**
 * BP������ <br>
 * 2019-09-13
 * 
 * @author ���ˬB
 *
 */
public class Bp {

    private double[] hide1_x;//// ����㼴��һ������������룻hide1_x[���ݵ�������Ŀ+1]�� hide1_x[0]Ϊ1
    private double[][] hide1_w;// ������Ȩֵ��hide1_w[����Ľڵ����Ŀ][���ݵ�������Ŀ+1];hide_w[0][0]Ϊƫ����
    private double[] hide1_errors;// ����������,hide1_errors[�ڵ����]

    private double[] out_x;// ����������ֵ���ڶ��β����������� out_x[��һ��Ľڵ���Ŀ+1]�� out_x[0]Ϊ1
    private double[][] out_w;// ������Ȩֵ hide1_w[�ڵ����Ŀ][��һ��Ľڵ���Ŀ+1]//
                             // out_w[0][0]Ϊƫ����
    private double[] out_errors;// ��������� hide1_errors[�ڵ����]

    private double[] target;// Ŀ��ֵ��target[�����Ľڵ����]

    private double rate;// ѧϰ����

    public Bp(int input_node, int hide1_node, int out_node, double rate) {
        super();

        // ����㼴��һ�������������
        hide1_x = new double[input_node + 1];

        // ��һ��������
        hide1_w = new double[hide1_node][input_node + 1];
        hide1_errors = new double[hide1_node];

        // �����
        out_x = new double[hide1_node + 1];
        out_w = new double[out_node][hide1_node + 1];
        out_errors = new double[out_node];

        target = new double[out_node];

        // ѧϰ����
        this.rate = rate;
        init_weight();// 1.��ʼ�������Ȩֵ
    }

    /**
     * ��ʼ��Ȩֵ
     */
    public void init_weight() {

        set_weight(hide1_w);
        set_weight(out_w);
    }

    /**
     * ��ʼ��Ȩֵ
     * 
     * @param w
     */
    private void set_weight(double[][] w) {
        for (int i = 0, len = w.length; i != len; i++)
            for (int j = 0, len2 = w[i].length; j != len2; j++) {
                w[i][j] = 0;
            }
    }

    /**
     * ��ȡԭʼ����
     * 
     * @param Data
     * ԭʼ���ݾ���
     */
    private void setHide1_x(double[] Data) {
        if (Data.length != hide1_x.length - 1) {
            throw new IllegalArgumentException("���ݴ�С�������ڵ㲻ƥ��");
        }
        System.arraycopy(Data, 0, hide1_x, 1, Data.length);
        hide1_x[0] = 1.0;
    }

    /**
     * @param target
     * the target to set
     */
    private void setTarget(double[] target) {
        this.target = target;
    }

    /**
     * 2.ѵ�����ݼ�
     * 
     * @param TrainData
     * ѵ������
     * @param target
     * Ŀ��
     */
    public void train(double[] TrainData, double[] target) {
        // 2.1����ѵ�����ݼ���Ŀ��ֵ
        setHide1_x(TrainData);
        setTarget(target);

        // 2.2����ǰ�����õ����ֵ��
        double[] output = new double[out_w.length + 1];
        forword(hide1_x, output);

        // 2.3�����򴫲���
        backpropagation(output);

    }

    /**
     * ���򴫲�����
     * 
     * @param output
     * Ԥ����
     */
    public void backpropagation(double[] output) {

        // 2.3.1����ȡ��������
        get_out_error(output, target, out_errors);
        // 2.3.2����ȡ���������
        get_hide_error(out_errors, out_w, out_x, hide1_errors);
        //// 2.3.3�������������Ȩֵ��
        update_weight(hide1_errors, hide1_w, hide1_x);
        // * 2.3.4������������Ȩֵ��
        update_weight(out_errors, out_w, out_x);
    }

    /**
     * Ԥ��
     * 
     * @param data
     * Ԥ������
     * @param output
     * ���ֵ
     */
    public void predict(double[] data, double[] output) {

        double[] out_y = new double[out_w.length + 1];
        setHide1_x(data);
        forword(hide1_x, out_y);
        System.arraycopy(out_y, 1, output, 0, output.length);

    }

    public void update_weight(double[] err, double[][] w, double[] x) {

        double newweight = 0.0;
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i].length; j++) {
                newweight = rate * err[i] * x[j];
                w[i][j] = w[i][j] + newweight;
            }

        }
    }

    /**
     * ��ȡ���������
     * 
     * @param output
     * Ԥ�����ֵ
     * @param target
     * Ŀ��ֵ
     * @param out_error
     * ���������
     */
    public void get_out_error(double[] output, double[] target, double[] out_error) {
        for (int i = 0; i < target.length; i++) {
            out_error[i] = (target[i] - output[i + 1]) * output[i + 1] * (1d - output[i + 1]);
        }

    }

    /**
     * ��ȡ����������
     * 
     * @param NeLaErr
     * ��һ������
     * @param Nextw
     * ��һ���Ȩֵ
     * @param output ��һ�������
     * @param error
     * �����������
     */
    public void get_hide_error(double[] NeLaErr, double[][] Nextw, double[] output, double[] error) {

        for (int k = 0; k < error.length; k++) {
            double sum = 0;
            for (int j = 0; j < Nextw.length; j++) {
                sum += Nextw[j][k + 1] * NeLaErr[j];
            }
            error[k] = sum * output[k + 1] * (1d - output[k + 1]);
        }
    }

    /**
     * ��ǰ����
     * 
     * @param x
     * ����ֵ
     * @param output
     * ���ֵ
     */
    public void forword(double[] x, double[] output) {

        // 2.2.1����ȡ����������
        get_net_out(x, hide1_w, out_x);
        // 2.2.2����ȡ���������
        get_net_out(out_x, out_w, output);

    }

    /**
     * ��ȡ�����ڵ�����
     * 
     * @param x
     * �������
     * @param w
     * Ȩֵ
     * @return ���ֵ
     */
    private double get_node_put(double[] x, double[] w) {
        double z = 0d;

        for (int i = 0; i < x.length; i++) {
            z += x[i] * w[i];
        }
        // 2.��������
        return 1d / (1d + Math.exp(-z));
    }

    /**
     * ��ȡ���������
     * 
     * @param x
     * �������
     * @param w
     * Ȩֵ����
     * @param net_out
     * �����������������
     */
    private void get_net_out(double[] x, double[][] w, double[] net_out) {

        net_out[0] = 1d;
        for (int i = 0; i < w.length; i++) {
            net_out[i + 1] = get_node_put(x, w[i]);
        }

    }

}
