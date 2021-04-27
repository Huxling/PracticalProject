import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Workfind {
    String sql;
    Statement stmt = null;
    Workconnect wc = new Workconnect();
    public void run(Integer id){
        if((stmt = wc.run())!=null) {
            this.sql = "select * from book_info where book_id = " + id;
            Integer bid = null;
            String name = null;
            String store = null;
            String price = null;
            String sales = null;
            try {
                ResultSet rs = stmt.executeQuery(this.sql);
                while(rs.next()) {
                    bid = rs.getInt("book_id");
                    name = rs.getString("name");
                    store = rs.getString("store");
                    price = rs.getString("price");
                    sales = rs.getString("sales");
                    System.out.println(bid + "\t\t" + name + "\t\t" + store + "\t\t" + price + "\t\t" + sales);
                }
                wc.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("查询失败，请检查数据库连接");
        }
    }
}
