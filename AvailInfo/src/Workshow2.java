import java.sql.*;

public class Workshow {
    String sql = "select * from book_info";
    Statement stmt = null;
    Workconnect wc = new Workconnect();
    public void run(){
        if((stmt = wc.run())!=null) {
            try {
                ResultSet rs = stmt.executeQuery(this.sql);
                Integer id = null;
                String name = null;
                String store = null;
                String price = null;
                String sales = null;
               
            }
        }
        else {
            System.out.println("查询失败，请检查数据库连接");
        }
    }
}
