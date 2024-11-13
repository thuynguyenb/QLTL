
package QuanLyTaiLieu.View;

import QuanLyTaiLieu.Controller.QuyenTruyCapController;
import QuanLyTaiLieu.Model.QuyenTruyCapModel;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuyenTruyCapView extends javax.swing.JFrame {

    public QuyenTruyCapView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
   private void HienThi() throws ClassNotFoundException {
    try {
        QuyenTruyCapController QTCcontroller = new QuyenTruyCapController();
        ArrayList<QuyenTruyCapModel> QTCList = QTCcontroller.DocQuyen();

        DefaultTableModel tableModel = (DefaultTableModel) tblQuyenTruyCap.getModel();
        tableModel.setRowCount(0);
        
        for (QuyenTruyCapModel qtc : QTCList) {
            int MaTaiLieu = qtc.getMaTaiLieu();
            String TenTaiLieu = qtc.getTenTaiLieu();
            String DanhSachNguoiDung = qtc.getDanhSachNguoiDung();
            String QuyenTruyCap = qtc.getQuyenTruyCap();
            String NgayCapQuyen = new SimpleDateFormat("dd/MM/yyyy").format(qtc.getNgayCapQuyen());
            String NgayHetHan = new SimpleDateFormat("dd/MM/yyyy").format(qtc.getNgayHetHan());

            tableModel.addRow(new Object[] {MaTaiLieu, TenTaiLieu, DanhSachNguoiDung, QuyenTruyCap, NgayCapQuyen, NgayHetHan});
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Lỗi khi lấy dữ liệu quyền truy cập: " + ex.getMessage());
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNguoiDung = new javax.swing.JButton();
        btnTaiLieu = new javax.swing.JButton();
        btnQuyenTruyCap = new javax.swing.JButton();
        btnDanhMuc = new javax.swing.JButton();
        btnThungRac = new javax.swing.JButton();
        btnTrangChu = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuyenTruyCap = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtMaTaiLieu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTenTaiLieu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNguoiDung = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        chkbXem = new javax.swing.JCheckBox();
        chkbSua = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        dateNgayCapQuyen = new com.toedter.calendar.JDateChooser();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconTL.png"))); // NOI18N
        jLabel2.setText("ỨNG DỤNG QUẢN LÝ TÀI LIỆU");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        btnNguoiDung.setBackground(new java.awt.Color(0, 128, 128));
        btnNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNguoiDung.setForeground(new java.awt.Color(204, 255, 255));
        btnNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        btnNguoiDung.setText("  NGƯỜI DÙNG");

        btnTaiLieu.setBackground(new java.awt.Color(0, 128, 128));
        btnTaiLieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaiLieu.setForeground(new java.awt.Color(204, 255, 255));
        btnTaiLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paper.png"))); // NOI18N
        btnTaiLieu.setText("  TÀI LIỆU");

        btnQuyenTruyCap.setBackground(new java.awt.Color(0, 128, 128));
        btnQuyenTruyCap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuyenTruyCap.setForeground(new java.awt.Color(204, 255, 255));
        btnQuyenTruyCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/access-control.png"))); // NOI18N
        btnQuyenTruyCap.setText("  QUYỀN TRUY CẬP");
        btnQuyenTruyCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuyenTruyCapActionPerformed(evt);
            }
        });

        btnDanhMuc.setBackground(new java.awt.Color(0, 128, 128));
        btnDanhMuc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDanhMuc.setForeground(new java.awt.Color(204, 255, 255));
        btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnDanhMuc.setText("  DANH MỤC");

        btnThungRac.setBackground(new java.awt.Color(0, 128, 128));
        btnThungRac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThungRac.setForeground(new java.awt.Color(204, 255, 255));
        btnThungRac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bin.png"))); // NOI18N
        btnThungRac.setText("  THÙNG RÁC");

        btnTrangChu.setBackground(new java.awt.Color(0, 128, 128));
        btnTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrangChu.setForeground(new java.awt.Color(204, 255, 255));
        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnTrangChu.setText(" TRANG CHỦ");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDanhMuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuyenTruyCap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(btnTaiLieu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNguoiDung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrangChu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThungRac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnTrangChu)
                .addGap(28, 28, 28)
                .addComponent(btnNguoiDung)
                .addGap(46, 46, 46)
                .addComponent(btnTaiLieu)
                .addGap(38, 38, 38)
                .addComponent(btnQuyenTruyCap)
                .addGap(50, 50, 50)
                .addComponent(btnDanhMuc)
                .addGap(48, 48, 48)
                .addComponent(btnThungRac)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(51, 51, 51));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUYỀN TRUY CẬP");

        tblQuyenTruyCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Tài Liệu", "Tên Tài Liệu", "Người Dùng", "Quyền truy cập", "Ngày cấp quyền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblQuyenTruyCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuyenTruyCapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuyenTruyCap);

        jLabel3.setText("Mã tài liệu:");

        jLabel4.setText("Tên tài liệu:");

        jLabel5.setText("Người dùng: ");

        jLabel6.setText("Quyền truy cập:");

        chkbXem.setText("Xem");

        chkbSua.setText("Sửa");

        jLabel7.setText("Ngày cấp quyền: ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaTaiLieu)
                            .addComponent(txtTenTaiLieu)
                            .addComponent(txtNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addGap(153, 153, 153)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateNgayCapQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkbXem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkbSua, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua)
                            .addComponent(btnThem)
                            .addComponent(btnXoa))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaTaiLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(chkbXem)
                            .addComponent(chkbSua)
                            .addComponent(btnThem))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtTenTaiLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addComponent(dateNgayCapQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoa)))
                            .addComponent(btnSua))))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuyenTruyCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuyenTruyCapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuyenTruyCapActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void capNhatDuLieuDatabase(int selectedRow) {
}

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String MaTaiLieu = txtMaTaiLieu.getText();
        String TenTaiLieu = txtTenTaiLieu.getText();
        String NguoiDung = txtNguoiDung.getText();
        
        if (MaTaiLieu.isEmpty() || TenTaiLieu.isEmpty() || NguoiDung.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
    }

        String QuyenTruyCap = chkbXem.isSelected() ? "Xem" : "";
        String QuyenTruyCap1 = chkbSua.isSelected() ? "Sửa" : "";

        if (QuyenTruyCap.isEmpty() && QuyenTruyCap1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn quyền truy cập.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Date NgayCapQuyen = dateNgayCapQuyen.getDate();
        if (NgayCapQuyen == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày cấp quyền.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

    // Nếu không có lỗi, tiếp tục thực hiện thêm quyền truy cập vào bảng hoặc cơ sở dữ liệu
        DefaultTableModel model = (DefaultTableModel) tblQuyenTruyCap.getModel();
        model.addRow(new Object[] {
        MaTaiLieu, 
        TenTaiLieu, 
        NguoiDung, 
        QuyenTruyCap + (QuyenTruyCap1.isEmpty() ? "" : ", " + QuyenTruyCap1),
        new SimpleDateFormat("dd/MM/yyyy").format(NgayCapQuyen),
    });

    JOptionPane.showMessageDialog(this, "Thêm quyền truy cập thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);

    // Có thể gọi lại phương thức làm mới bảng nếu cần
    try {
        HienThi();  // Làm mới bảng sau khi thêm
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi làm mới bảng: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblQuyenTruyCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuyenTruyCapMouseClicked
//        // TODO add your handling code here:
//        int selectedRow = tblQuyenTruyCap.getSelectedRow();
//        if (selectedRow != -1) {
//            txtMaTaiLieu.setText(tblQuyenTruyCap.getValueAt(selectedRow, 0).toString());
//            txtTenTaiLieu.setText(tblQuyenTruyCap.getValueAt(selectedRow, 1).toString());
//            txtNguoiDung.setText(tblQuyenTruyCap.getValueAt(selectedRow, 2).toString());
//
//            chkbSua.setSelected((Boolean) tblQuyenTruyCap.getValueAt(selectedRow, 3));
//            chkbXem.setSelected((Boolean) tblQuyenTruyCap.getValueAt(selectedRow, 4));
//
//            Date NgayCapQuyen = (Date) tblQuyenTruyCap.getValueAt(selectedRow, 5);
//            dateNgayCapQuyen.setDate(NgayCapQuyen);
//        }
    }//GEN-LAST:event_tblQuyenTruyCapMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
//        int selectedRow = tblQuyenTruyCap.getSelectedRow();
//        if (selectedRow != -1) {
//            String maTaiLieu = txtMaTaiLieu.getText();
//            String tenTaiLieu = txtTenTaiLieu.getText();
//            String danhSachNguoiDung = txtNguoiDung.getText();
//            String quyenTruyCap = "";
//        if (chkbSua.isSelected()) {
//            quyenTruyCap += "Sửa";
//        }
//        if (chkbXem.isSelected()) {
//            if (!quyenTruyCap.isEmpty()) {
//                quyenTruyCap += ", ";
//            }
//            quyenTruyCap += "Xem";
//        }
//
//        Date NgayCapQuyen = dateNgayCapQuyen.getDate();

//        // Cập nhật bảng với các giá trị mới
//        tblQuyenTruyCap.setValueAt(MaTaiLieu, selectedRow, 0);
//        tblQuyenTruyCap.setValueAt(TenTaiLieu, selectedRow, 1);
//        tblQuyenTruyCap.setValueAt(DanhSachNguoiDung, selectedRow, 2);
//        tblQuyenTruyCap.setValueAt(QuyenTruyCap, selectedRow, 3); 
//        tblQuyenTruyCap.setValueAt(NgayCapQuyen, selectedRow, 5);
//
//        CapNhatDuLieuDatabase(selectedRow);
//            JOptionPane.showMessageDialog(null, "Đã cập nhật thành công!");
//        } 
//        else {
//        JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng cần cập nhật.");
//    }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
//        int row = tblQuyenTruyCap.getSelectedRow();
//
//        if(row >= 0){
//            String MaTaiLieu = tblQuyenTruyCap.getValueAt(row, 0).toString();
//
//        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa quyền truy cập cho mã tài liệu này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
//
//        if (confirm == JOptionPane.YES_OPTION) {
//            try {
//                boolean result = new QuyenTruyCapController().XoaQuyen(MaTaiLieu);
//
//                if (result) {
//                    JOptionPane.showMessageDialog(null, "Xóa quyền truy cập thành công!");
//                    HienThi();
//                } 
//                else {
//                    JOptionPane.showMessageDialog(null, "Xóa quyền truy cập thất bại! Vui lòng thử lại.");
//                }
//            } 
//            catch (ClassNotFoundException ex) {
//                Logger.getLogger(QuyenTruyCapModel.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null, "Lỗi kết nối cơ sở dữ liệu. Vui lòng thử lại.");
//            } catch (Exception ex) {
//                Logger.getLogger(QuyenTruyCapModel.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null, "Lỗi khi xóa quyền truy cập từ cơ sở dữ liệu. Vui lòng thử lại.");
//            }
//        }
//    } 
//        else {
//        JOptionPane.showMessageDialog(null, "Vui lòng chọn một quyền truy cập để xóa.");
//    }
    }//GEN-LAST:event_btnXoaMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuyenTruyCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuyenTruyCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuyenTruyCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuyenTruyCapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new QuyenTruyCapView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnNguoiDung;
    private javax.swing.JButton btnQuyenTruyCap;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiLieu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThungRac;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkbSua;
    private javax.swing.JCheckBox chkbXem;
    private com.toedter.calendar.JDateChooser dateNgayCapQuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblQuyenTruyCap;
    private javax.swing.JTextField txtMaTaiLieu;
    private javax.swing.JTextField txtNguoiDung;
    private javax.swing.JTextField txtTenTaiLieu;
    // End of variables declaration//GEN-END:variables
}