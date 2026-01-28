package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam01 {

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

            // 山田追加
            sql = "INSERT INTO test_members(name, age, dep_id) VALUES('山田太郎', '62', '1');";
            pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();

            // 佐藤追加
            sql = "INSERT INTO test_members(name, age, dep_id) VALUES('佐藤花子', '33', '2');";
            pstmt = con.prepareStatement(sql);
            int resultSecond = pstmt.executeUpdate();

            // 遠藤追加
            sql = "INSERT INTO test_members(name, age, dep_id) VALUES('遠藤次郎', '55', '2');";
            pstmt = con.prepareStatement(sql);
            int resultThird = pstmt.executeUpdate();

            // (5)結果の操作
            // ※ここに結果の操作処理を書く
            System.out.println(result + resultSecond + resultThird + "件のデータを追加しました");

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
