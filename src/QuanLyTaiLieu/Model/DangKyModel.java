
package QuanLyTaiLieu.Model;

public class DangKyModel {
    private String HoVaTen;
    private String SoDienThoai;
    private String Email;
    private String TenTaiKhoan;
    private String MatKhau;

    
    public DangKyModel() {
    }

    public DangKyModel(String HoVaTen, String SoDienThoai, String Email, String TenTaiKhoan, String MatKhau) {
        this.HoVaTen = HoVaTen;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
}
