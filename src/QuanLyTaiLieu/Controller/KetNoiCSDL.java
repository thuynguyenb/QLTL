package QuanLyTaiLieu.Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class KetNoiCSDL {
    protected Connection con = null;

    public KetNoiCSDL() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionurl = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYTAILIEU;encrypt=false";
            con = DriverManager.getConnection(connectionurl, "sa", "123456");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // trả về đối tượng Connection hiện tại
    public Connection getConnection() {
        return con;
    }
}
