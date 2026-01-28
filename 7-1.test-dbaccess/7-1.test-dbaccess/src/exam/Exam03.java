package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam03 {

    public static void main(String[] args) {
        // 接続情報
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "postgres";

        Connection con = null; // 使用する変数の宣言
        PreparedStatement pstmt = null;
        String sql = null;
        ResultSet rs = null;
        try {
            // (1)データベースに接続
            con = DriverManager.getConnection(url, user, password);

            // (2)SQL文を作成
            sql = "SELECT m.id,m.name,age,d.name as depname FROM test_members AS m INNER JOIN test_deps AS d ON m.dep_id = d.id;";

            // (3)SQL実行準備
            pstmt = con.prepareStatement(sql);

            // (4)SQL実行
            // ※ここにSQL実行処理を書く
            rs = pstmt.executeQuery();

            // (5)結果の操作
            // ※ここに結果の操作処理を書く
            while (rs.next()) {
                System.out.print("id:" + rs.getInt("id"));
                System.out.print(",name:" + rs.getString("name"));
                System.out.print(",age:" + rs.getInt("age"));
                System.out.println(",dep_name:" + rs.getString("depname"));
            }

        } catch (SQLException ex) {
            System.err.println("SQL = " + sql);
            ex.printStackTrace();
        } finally {
            try {
                // (6) メモリの解放(切断)
                if (con != null) {
                    con.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
