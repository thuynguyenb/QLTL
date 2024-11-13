package QuanLyTaiLieu.Controller;

import QuanLyTaiLieu.Model.QuyenTruyCapModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class QuyenTruyCapController extends KetNoiCSDL {
    
    public ArrayList<QuyenTruyCapModel> DocQuyen() {
    ArrayList<QuyenTruyCapModel> arrQTC = new ArrayList<>();
    try {
        String sql = "SELECT * FROM tblQuyenTruyCap";
        PreparedStatement statement = con.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            QuyenTruyCapModel qtc = new QuyenTruyCapModel();
            qtc.setMaTaiLieu(rs.getInt("MaTaiLieu"));
            qtc.setTenTaiLieu(rs.getString("TenTaiLieu"));
            qtc.setDanhSachNguoiDung(rs.getString("DanhSachNguoiDung"));
            qtc.setQuyenTruyCap(rs.getString("QuyenTruyCap"));
            qtc.setNgayCapQuyen(rs.getDate("NgayCapQuyen"));
//            qtc.setNgayHetHan(rs.getDate("NgayHetHan"));
            arrQTC.add(qtc);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Lỗi khi lấy dữ liệu quyền truy cập: " + ex.getMessage());
    }
    return arrQTC;
}


    // Thêm quyền truy cập mới
    public boolean ThemQuyen(int MaTaiLieu, String TenTaiLieu, String DanhSachNguoiDung, String QuyenTruyCap, Date NgayCapQuyen) throws SQLException {
        
            String sql = "INSERT INTO tblQuyenTruyCap (MaTaiLieu, TenTaiLieu, DanhSachNguoiDung, QuyenTruyCap, NgayCapQuyen) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,MaTaiLieu);
            ps.setString(2, TenTaiLieu);
            ps.setString(3, DanhSachNguoiDung);
            ps.setString(4, QuyenTruyCap);
            ps.setDate(5, NgayCapQuyen);
            ps.close();
            
            int d = ps.executeUpdate();
            return d > 0;
    }

    // Sửa quyền truy cập
    public int SuaQuyen(QuyenTruyCapModel qtc) {
        int result = 0;
        try {
            String sql = "UPDATE tblQuyenTruyCap SET TenTaiLieu = ?, DanhSachNguoiDung = ?, QuyenTruyCap = ?, NgayCapQuyen = ?, NgayHetHan = ? WHERE MaTaiLieu = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, qtc.getTenTaiLieu());
            ps.setString(2, qtc.getDanhSachNguoiDung());
            ps.setString(3, qtc.getQuyenTruyCap());
            ps.setDate(4, new Date(qtc.getNgayCapQuyen().getTime()));
            ps.setDate(5, new Date(qtc.getNgayHetHan().getTime()));
            ps.setInt(6, qtc.getMaTaiLieu());

            result = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi sửa quyền truy cập: " + ex.getMessage());
        }
        return result;
    }

    // Xóa quyền truy cập
    public boolean XoaQuyen(String MaTaiLieu){
    try {
    String sql = "DELETE FROM tblQuyenTruyCap WHERE MaTaiLieu = ?";
    PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, MaTaiLieu);
        int rowsAffected = ps.executeUpdate();
        return rowsAffected > 0;
    }
    catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xóa quyền truy cập: " + ex.getMessage());
        }
        return false;
}
}

