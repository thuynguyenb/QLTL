package QuanLyTaiLieu.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DangNhapController extends KetNoiCSDL { 
    
    public boolean KiemTraDangNhap(String TenTaiKhoan, String MatKhau) {
        String sql = "SELECT * FROM tblNguoiDung WHERE TenTaiKhoan = ? AND MatKhau = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, TenTaiKhoan);   //1: index (? dau tien)
            ps.setString(2, MatKhau);
            
            ResultSet rs = ps.executeQuery();  //thuc thi va tra lai doi tuong
            
            if (rs.next()){  
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return false; 
    }
}
