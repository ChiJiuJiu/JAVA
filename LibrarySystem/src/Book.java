
import java.awt.BorderLayout;
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
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Book实体以及对应增删改查操作实现
 * 
 * @author 806 陆冯莉
 *
 */
public class Book extends JFrame {
    /** 实现序列化类的不同版本间的兼容性 */
    private static final long serialVersionUID = 1L;
    /** 图书编号标签 */
    private JLabel lblId;
    /** 书名标签 */
    private JLabel lblBname;
    /** 作者名标签 */
    private JLabel lblWname;
    /** 出版社标签 */
    private JLabel lblCbs;
    /** 现存量标签 */
    private JLabel lblnum1;
    /** 库存量标签 */
    private JLabel lblnum2;
    /** 图书编号 */
    private JTextField bId;
    /** 书名 */
    private JTextField bname;
    /** 作者名 */
    private JTextField wname;
    /** 出版社 */
    private JTextField cbs;
    /** 现存量 */
    private JTextField num1;
    /** 库存量 */
    private JTextField num2;
    /** 删除按钮 */
    private JButton jbDel;
    /** 指定删除输入的表单 */
    private JTextField jDel;
    /** 增加按钮 */
    private JButton jbAdd;
    /** 查询按钮 */
    private JButton jbSearch;
    /** 更新按钮 */
    private JButton jbUpdate;
    /** 要查找的书号 */
    private JLabel jabel;

    // 设置按钮和文本框 start
    public JLabel getJabel() {
        if (jabel == null) {
            jabel = new JLabel("查找书号");
            jabel.setBounds(50, 350, 50, 30);
        }
        return jabel;
    }

    public JButton getJbDel() {
        if (jbDel == null) {
            jbDel = new JButton("删除");
            jbDel.setBounds(180, 400, 60, 30);
        }
        return jbDel;
    }

    public JTextField getjDel() {
        if (jDel == null) {
            jDel = new JTextField(20);
            jDel.setBounds(100, 350, 150, 30);
        }
        return jDel;
    }

    public JButton getJbAdd() {
        if (jbAdd == null) {
            jbAdd = new JButton("添加");
            jbAdd.setBounds(100, 400, 60, 30);
        }
        return jbAdd;
    }

    public JButton getJbSearch() {
        if (jbSearch == null) {
            jbSearch = new JButton("查找");
            jbSearch.setBounds(100, 450, 60, 30);
        }
        return jbSearch;
    }

    public JButton getJbUpdate() {
        if (jbUpdate == null) {
            jbUpdate = new JButton("修改");
            jbUpdate.setBounds(180, 450, 60, 30);
        }
        return jbUpdate;
    }

    public JLabel getLblId() {
        if (lblId == null) {
            lblId = new JLabel("编号");
            lblId.setBounds(50, 50, 50, 30);
        }
        return lblId;
    }

    public JLabel getLblBname() {
        if (lblBname == null) {
            lblBname = new JLabel("书名");
            lblBname.setBounds(50, 100, 50, 30);
        }
        return lblBname;
    }

    public JLabel getLblWname() {
        if (lblWname == null) {
            lblWname = new JLabel("作者");
            lblWname.setBounds(50, 150, 50, 30);
        }
        return lblWname;
    }

    public JLabel getLblnum1() {
        if (lblnum1 == null) {
            lblnum1 = new JLabel("现存量");
            lblnum1.setBounds(50, 200, 50, 30);
        }
        return lblnum1;
    }

    public JLabel getLblnum2() {
        if (lblnum2 == null) {
            lblnum2 = new JLabel("库存量");
            lblnum2.setBounds(50, 250, 50, 30);
        }
        return lblnum2;
    }

    public JTextField getbId() {
        if (bId == null) {
            bId = new JTextField(20);
            bId.setBounds(100, 50, 150, 30);
        }
        return bId;
    }

    public JTextField getBname() {
        if (bname == null) {
            bname = new JTextField(20);
            bname.setBounds(100, 100, 150, 30);
        }
        return bname;
    }

    public JTextField getWname() {
        if (wname == null) {
            wname = new JTextField(20);
            wname.setBounds(100, 150, 150, 30);
        }
        return wname;
    }

    public JTextField getNum1() {
        if (num1 == null) {
            num1 = new JTextField(20);
            num1.setBounds(100, 200, 150, 30);
        }
        return num1;
    }

    public JTextField getNum2() {
        if (num2 == null) {
            num2 = new JTextField(20);
            num2.setBounds(100, 250, 150, 30);
        }
        return num2;
    }

    public JLabel getLblCbs() {
        if (lblCbs == null) {
            lblCbs = new JLabel("出版社");
            lblCbs.setBounds(50, 300, 50, 30);
        }
        return lblCbs;
    }

    public JTextField getCbs() {
        if (cbs == null) {
            cbs = new JTextField(20);
            cbs.setBounds(100, 300, 150, 30);
        }
        return cbs;
    }
    // 设置按钮和文本框 end

    public Book(String title) {
        super(title);
        Container cantainer = this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 背景图片
        ImageIcon img = new ImageIcon("background.jpg");
        // 将背景图放在标签里
        JLabel imgLabel = new JLabel(img);
        // 将背景标签添加到jfram的LayeredPane面板里
        this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
        // 设置背景标签的位置
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        cantainer.setLayout(new BorderLayout());
        imgLabel.setLayout(null);
        // 添加组件
        imgLabel.add(getLblId());
        imgLabel.add(getbId());
        imgLabel.add(getLblBname());
        imgLabel.add(getBname());
        imgLabel.add(getLblWname());
        imgLabel.add(getWname());
        imgLabel.add(getLblnum1());
        imgLabel.add(getNum1());
        imgLabel.add(getLblnum2());
        imgLabel.add(getNum2());
        imgLabel.add(getLblCbs());
        imgLabel.add(getCbs());
        imgLabel.add(getJbDel());
        imgLabel.add(getjDel());
        imgLabel.add(getJbAdd());
        imgLabel.add(getJbSearch());
        imgLabel.add(getJbUpdate());
        imgLabel.add(getJabel());
        cantainer.add(imgLabel, BorderLayout.NORTH);
        // 将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来
        ((JPanel)cantainer).setOpaque(false);
        this.setSize(img.getIconWidth(), img.getIconHeight());
        myEvent();
        this.setVisible(true);
        this.setResizable(true);
    }

    /**
     * 增删改查事件处理
     * 
     */
    private void myEvent() {
        // 增加
        jbAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ee) {
                Connection conn = null;
                Statement stm = null;
                String id1 = bId.getText();
                String name1 = bname.getText();
                String name2 = wname.getText();
                String n1 = num1.getText();
                String n2 = num2.getText();
                String chubs = cbs.getText();
                try {
                    // 数据库连接
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // 数据库url以及用户名、密码、库名指定
                    // 指定GMT时间
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8",
                        "root", "root");
                    stm = conn.createStatement();
                    String sql = "insert into book values('" + id1 + "','" + name1 + "','" + name2 + "','" + n1 + "','"
                        + n2 + "','" + chubs + "')";
                    stm.executeUpdate(sql);
                    getbId().setText("");
                    getBname().setText("");
                    getWname().setText("");
                    getNum1().setText("");
                    getNum2().setText("");
                    getCbs().setText("");
                } catch (ClassNotFoundException e) {

                } catch (SQLException e) {
                    e.printStackTrace();
                } finally { // 关闭Statement
                    try {
                        stm.close();
                    } catch (Exception e) {
                    }
                    // 关闭Connection
                    try {
                        conn.close();
                    } catch (Exception e) {
                    }
                }
            }
        });

        jbDel.addActionListener(new ActionListener() {
            // 删除
            public void actionPerformed(ActionEvent ee) {
                String id = jDel.getText();
                Connection conn = null;
                Statement stm = null;
                try {
                    // 数据库连接
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // 数据库url以及用户名、密码、库名指定
                    // 指定GMT时间
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8",
                        "root", "root");
                    String sql = "delete from book where Bid='" + id + "'";
                    stm = conn.createStatement();
                    stm.executeUpdate(sql);
                    getjDel().setText("");
                } catch (ClassNotFoundException e) {

                } catch (SQLException e) {
                    e.printStackTrace();
                } finally { // 关闭Statement
                    try {
                        stm.close();
                    } catch (Exception e) {
                    }
                    // 关闭Connection
                    try {
                        conn.close();
                    } catch (Exception e) {
                    }
                }
            }
        });

        jbSearch.addActionListener(new ActionListener() {
            // 查询
            public void actionPerformed(ActionEvent ee) {
                String id = jDel.getText();
                Connection conn = null;
                Statement stm = null;
                ResultSet rst = null;
                try {
                    // 数据库连接
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // 数据库url以及用户名、密码、库名指定
                    // 指定GMT时间
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8",
                        "root", "root");

                    // String sql="select * from book";
                    String sql = "select * from book where Bid='" + id + "'";
                    stm = conn.createStatement();
                    rst = stm.executeQuery(sql);
                    if (rst.next()) {
                        getbId().setText(rst.getString("Bid"));
                        getBname().setText(rst.getString("Bname"));
                        getWname().setText(rst.getString("Wname"));
                        getNum1().setText(rst.getString("num1"));
                        getNum2().setText(rst.getString("num2"));
                        getCbs().setText(rst.getString("chubs"));
                        getjDel().setText("");
                    }
                } catch (ClassNotFoundException e) {

                } catch (SQLException e) {
                    e.printStackTrace();
                } finally { // 关闭Statement
                    try {
                        stm.close();
                    } catch (Exception e) {
                    }
                    // 关闭Connection
                    try {
                        conn.close();
                    } catch (Exception e) {
                    }
                }
            }
        });

        jbUpdate.addActionListener(new ActionListener() {
            // 修改更新
            public void actionPerformed(ActionEvent ee) {
                // 获取表单中的值
                String id1 = bId.getText();
                String name1 = bname.getText();
                String name2 = wname.getText();
                String n1 = num1.getText();
                String n2 = num2.getText();
                String chubs = cbs.getText();
                Connection conn = null;
                Statement stm = null;
                try {
                    // 数据库连接
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // 数据库url以及用户名、密码、库名指定
                    // 指定GMT时间
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?serverTimezone=GMT%2B8",
                        "root", "root");
                    String sql = "update library.book set Bname='" + name1 + "',Wname='" + name2 + "',num1='" + n1
                        + "',num2='" + n2 + "',chubs='" + chubs + "'  where Bid='" + id1 + "'";
                    stm = conn.createStatement();
                    stm.executeUpdate(sql);

                } catch (ClassNotFoundException e) {

                } catch (SQLException e) {
                    e.printStackTrace();
                } finally { // 关闭Statement
                    try {
                        stm.close();
                    } catch (Exception e) {
                    }
                    // 关闭Connection
                    try {
                        conn.close();
                    } catch (Exception e) {
                    }
                }
            }
        });
    }
}