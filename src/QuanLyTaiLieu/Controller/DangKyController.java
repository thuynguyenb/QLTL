package QuanLyTaiLieu.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DangKyController extends KetNoiCSDL {

    // Thêm người dùng mới vào cơ sở dữ liệu
    public void ThemNguoiDung(String HoVaTen, String SoDienThoai, String Email, String TenTaiKhoan, String MatKhau) {
        String sql = "INSERT INTO tblNguoiDung(HoVaTen, SoDienThoai, Email, TenTaiKhoan, MatKhau) VALUES(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, HoVaTen);
            ps.setString(2, SoDienThoai);
            ps.setString(3, Email);
            ps.setString(4, TenTaiKhoan);
            ps.setString(5, MatKhau);
            
            int rs = ps.executeUpdate();
            if (rs != 0) {
                System.out.println("Thêm thành công!");
            } else {
                System.out.println("Thêm thất bại!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Kiểm tra xem số điện thoại đã tồn tại hay chưa
    public boolean isPhoneNumberExist(String SoDienThoai) {
        String sql = "SELECT COUNT(*) FROM tblNguoiDung WHERE SoDienThoai = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, SoDienThoai);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1) > 0;  // Nếu có ít nhất 1 kết quả, số điện thoại đã tồn tại
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // Kiểm tra xem email đã tồn tại hay chưa
    public boolean isEmailExist(String Email) {
        String sql = "SELECT COUNT(*) FROM tblNguoiDung WHERE Email = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Email);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1) > 0;  
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // Kiểm tra xem tên tài khoản đã tồn tại hay chưa
    public boolean isUsernameExist(String TenTaiKhoan) {
        String sql = "SELECT COUNT(*) FROM tblNguoiDung WHERE TenTaiKhoan = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, TenTaiKhoan);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1) > 0;  
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
