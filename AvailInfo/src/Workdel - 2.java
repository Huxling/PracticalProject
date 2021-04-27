import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Workdel {
    String sql;
    Statement stmt = null;
    Workconnect wc = new Workconnect();
    public void run(Integer id){
        if((stmt = wc.run())!=null) {
            this.sql = "delete from book_info where book_id = " + id;
            try {
                stmt.executeUpdate(this.sql);
                System.out.println("书号 "+ id +" 删除成功");
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
