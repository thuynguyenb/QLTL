
package QuanLyTaiLieu.Model;

public class DangNhapModel {
    private String TenTaiKhoan;
    private String MatKhau;
    
    
    public DangNhapModel(){
    }
    public DangNhapModel(String TenTaiKhoan, String MatKhau){
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
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