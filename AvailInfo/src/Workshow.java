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
                System.out.println("书号"+"\t\t书名" +"\t\t商店"+"\t\t价格"+"\t\t销量");
                while(rs.next()){
                    id = rs.getInt("book_id");
                    name = rs.getString("name");
                    store = rs.getString("store");
                    price=rs.getString("price");
                    sales=rs.getString("sales");
                    System.out.println(id+"\t\t"+name + "\t\t" + store+"\t\t"+price+"\t\t"+sales);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("查询失败，请检查数据库连接");
        }
    }
}
