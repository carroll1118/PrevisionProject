import java.sql.*;

class JdbcDemo { // 创建类Conn
    private static JdbcDemo jdbcDemo = new JdbcDemo();
    private JdbcDemo(){}

    static public JdbcDemo getJdbcDemo(){
        return jdbcDemo;
    }

    Connection con; // 声明Connection对象

    public Connection getConnection() {// 建立返回值为Connection的方法
        try {
            // 加载数据库驱动类
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {// 通过访问数据库的URL获取数据库连接对象
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test"
                    , "root", "");

//root  为数据库账户  123456是我为我的mysql数据库设置的密码，当然也可以不设置密码。连接需要添加一个Jar包，mysql.connnector

            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con; // 按方法要求返回一个Connection对象
    }

}
