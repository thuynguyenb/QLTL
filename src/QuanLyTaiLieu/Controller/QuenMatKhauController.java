package QuanLyTaiLieu.Controller;

import QuanLyTaiLieu.Model.QuenMatKhauModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuenMatKhauController extends KetNoiCSDL {
    
    // Kiểm tra email hợp lệ
    public boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email.trim());
        return matcher.matches();
    }
    
    public boolean GuiMa(QuenMatKhauModel model) {
        String email = model.getEmail().trim();
        return !email.isEmpty() && isValidEmail(email);
    }

    public boolean KiemTraEmailDaDangKy(String email) {
    String sql = "SELECT COUNT(*) FROM tblNguoiDung WHERE Email = ?";
    try (PreparedStatement ps = this.con.prepareStatement(sql)) {
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}

public boolean CapNhatMatKhau(String email, String matKhauMoi) {
    String sql = "UPDATE tblNguoiDung SET MatKhau = ? WHERE Email = ?";
    try (PreparedStatement ps = this.con.prepareStatement(sql)) {
        ps.setString(1, matKhauMoi);
        ps.setString(2, email);
        int result = ps.executeUpdate();
        return result > 0;
    } catch (Exception ex) {
        ex.printStackTrace();
        return false;
    }
}

}
