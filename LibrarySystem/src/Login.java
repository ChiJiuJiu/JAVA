import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 登陆启动类
 * 
 * @author 806 陆冯莉
 *
 */
public class Login extends JFrame {

    /** 实现序列化类的不同版本间的兼容性 */
    private static final long serialVersionUID = 1L;
    /** 用户名标签 */
    private JLabel jlUsername;
    /** 登入密码标签 */
    private JLabel jlPwd;
    /** 用户名 */
    private JTextField txtUsername;
    /** 密码 */
    private JTextField txtPassword;
    /** 登录界面的登陆键 */
    private JButton jbOk;
    /** 登录界面的取消键 */
    private JButton jbCancel;

    /**
     * 设置账号标签
     * 
     * @return
     */
    public JLabel getJlUsername() {
        if (jlUsername == null) {
            jlUsername = new JLabel("账号");
            // 设置前景色
            jlUsername.setForeground(Color.BLACK);
            // 设置账户标签左上角的坐标（120，40），长、宽的高分别为85、30
            jlUsername.setBounds(120, 40, 85, 30);
        }
        return jlUsername;
    }

    /**
     * 设置密码标签
     * 
     * @return
     */
    public JLabel getJlPwd() {
        if (jlPwd == null) {
            jlPwd = new JLabel("密码");
            jlPwd.setForeground(Color.BLACK);
            // 设置密码标签左上角的坐标（120，100），长、宽的高分别为85、30
            jlPwd.setBounds(120, 100, 85, 30);
        }
        return jlPwd;
    }

    /**
     * 设置用户名输入表单
     * 
     * @return
     */
    public JTextField getTxtUsername() {
        if (txtUsername == null) {
            txtUsername = new JTextField(20);
            // 设置标签左上角的坐标（180，40），长、宽的高分别为200、30
            txtUsername.setBounds(180, 40, 200, 30);
        }
        return txtUsername;
    }

    /**
     * 设置密码输入表单
     * 
     * @return
     */
    public JTextField getTxtPassword() {
        if (txtPassword == null) {
            txtPassword = new JPasswordField(20);
            // 设置标签左上角的坐标（180，100），长、宽的高分别为200、30
            txtPassword.setBounds(180, 100, 200, 30);
        }
        return txtPassword;
    }

    /**
     * 设置登陆标签
     * 
     * @return
     */
    public JButton getJbOk() {
        if (jbOk == null) {
            jbOk = new JButton("登陆");
            // 设置标签左上角的坐标（150，180），长、宽的高分别为90、30
            jbOk.setBounds(150, 180, 90, 30);
            // jbOk.addActionListener(this);

        }
        return jbOk;
    }

    /**
     * 设置取消标签
     * 
     * @return
     */
    public JButton getJbCancel() {
        if (jbCancel == null) {
            jbCancel = new JButton("取消");
            // 设置标签左上角的坐标（300，180），长、宽的高分别为85、30
            jbCancel.setBounds(300, 180, 90, 30);
        }
        return jbCancel;
    }

    /**
     * 登陆
     * 
     * @param title
     */
    public Login(String title) {
        super(title);
        Container cantainer = this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 这是背景图片
        ImageIcon img = new ImageIcon("background.jpg");
        // 将背景图放在标签里
        JLabel imgLabel = new JLabel(img);
        // 将背景标签添加到Jfram的LayeredPane面板里
        this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
        // 设置背景标签的位置
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        cantainer.setLayout(new BorderLayout());
        imgLabel.setLayout(null);
        // 添加组件
        imgLabel.add(getJlUsername());
        imgLabel.add(getTxtUsername());
        imgLabel.add(getJlPwd());
        imgLabel.add(getTxtPassword());
        imgLabel.add(getJbOk());
        imgLabel.add(getJbCancel());
        cantainer.add(imgLabel, BorderLayout.NORTH);
        // 将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。
        ((JPanel)cantainer).setOpaque(false);
        this.setSize(img.getIconWidth(), img.getIconHeight());
        myEvent();
        this.setVisible(true);
        this.setResizable(true);
    }

    private void myEvent() {
        jbCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login.this.dispose();
            }
        });

        jbOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection conn = null;
                Statement stm = null;
                ResultSet st = null;
                try {
                    // 数据库连接
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // 数据库url以及用户名、密码、库名指定
                    // 指定GMT时间
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8",
                        "root", "root");
                    stm = conn.createStatement();
                    String sql = "select * from user";
                    st = stm.executeQuery(sql);
                    // 迭代查询, 检验账号及密码
                    if (st.next()) {
                        if (txtUsername.getText().equals(st.getString("id"))
                            && txtPassword.getText().equals(st.getString("psw"))) {
                            // 登陆界面关闭可视
                            Login.this.setVisible(false);
                            new Book("管理界面");
                        } else {
                            JOptionPane.showMessageDialog(null, "您输入的账号或密码不正确");
                            getTxtUsername().setText("");
                            getTxtPassword().setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "用户名不存在,请重新输入,错误!");
                        getTxtUsername().setText("");
                        getTxtPassword().setText("");
                    }
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (SQLException e2) {
                    e2.printStackTrace();
                } finally {
                    try {
                        stm.close();
                    } catch (Exception e3) {
                    }
                    // 关闭Connection
                    try {
                        conn.close();
                    } catch (Exception e4) {
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new Login("图书管理登陆界面");
    }

}