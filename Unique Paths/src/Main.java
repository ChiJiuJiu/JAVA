
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//��̬�滮
class Solution {
    public int uniquePaths(int m, int n) {
        int i,j;
        int [][] a = new int[n][m]; 
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                if(i == 0 || j == 0)
                    a[i][j] = 1;
                else
                    a[i][j] = a[i-1][j] + a[i][j-1];
            }
        }
        return a[n-1][m-1];
    }
}

//�Ż��汾 �����
class Solution2 {
    public int uniquePaths(int m, int n) {
        double dom = 1;
    double dedom = 1;
    int small = m<n? m-1:n-1;
    int big = m<n? n-1:m-1;
    for(int i=1;i<=small;i++)
    {
        dedom *= i;
        dom *= small+big+1-i;
    }
    return (int)(dom/dedom);
// --------------------- 
// ���ߣ�Code_Ganker 
// ��Դ��CSDN 
// ԭ�ģ�https://blog.csdn.net/linhuanmars/article/details/22126357 
// ��Ȩ����������Ϊ����ԭ�����£�ת���븽�ϲ������ӣ�
    }
}