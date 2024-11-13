
package QuanLyTaiLieu.Model;

import java.util.Date;

public class QuyenTruyCapModel {
    private int MaTaiLieu;
    private String TenTaiLieu;
    private String DanhSachNguoiDung;
    private String QuyenTruyCap;
    private Date NgayCapQuyen;
    private Date NgayHetHan;

    public QuyenTruyCapModel() {
    }

    public QuyenTruyCapModel(int MaTaiLieu, String TenTaiLieu, String DanhSachNguoiDung, String QuyenTruyCap, Date NgayCapQuyen, Date NgayHetHan) {
        this.MaTaiLieu = MaTaiLieu;
        this.TenTaiLieu = TenTaiLieu;
        this.DanhSachNguoiDung = DanhSachNguoiDung;
        this.QuyenTruyCap = QuyenTruyCap;
        this.NgayCapQuyen = NgayCapQuyen;
        this.NgayHetHan = NgayHetHan;
    }

    public int getMaTaiLieu() {
        return MaTaiLieu;
    }

    public void setMaTaiLieu(int MaTaiLieu) {
        this.MaTaiLieu = MaTaiLieu;
    }

    public String getTenTaiLieu() {
        return TenTaiLieu;
    }

    public void setTenTaiLieu(String TenTaiLieu) {
        this.TenTaiLieu = TenTaiLieu;
    }

    public String getDanhSachNguoiDung() {
        return DanhSachNguoiDung;
    }

    public void setDanhSachNguoiDung(String DanhSachNguoiDung) {
        this.DanhSachNguoiDung = DanhSachNguoiDung;
    }

    public String getQuyenTruyCap() {
        return QuyenTruyCap;
    }

    public void setQuyenTruyCap(String QuyenTruyCap) {
        this.QuyenTruyCap = QuyenTruyCap;
    }

    public Date getNgayCapQuyen() {
        return NgayCapQuyen;
    }

    public void setNgayCapQuyen(Date NgayCapQuyen) {
        this.NgayCapQuyen = NgayCapQuyen;
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    
}