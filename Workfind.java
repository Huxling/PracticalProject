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