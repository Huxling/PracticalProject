import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Workconnect {
    Connection conn;
    Statement stmt = null;
    public Statement run() {
        try {
            //调用Class.forName()方法加载驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            System.out.println("找不到MySQL驱动!");
            e1.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/book_data?serverTimezone=UTC";
        try {
            this.conn = DriverManager.getConnection(url, "root", "123456");
            this.stmt = this.conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }
    public void close(){
        try {
            this.conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
