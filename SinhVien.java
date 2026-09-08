public class SinhVien {

    String maSV;
    String hoTen;
    double diemTB;

    // Constructor
    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    // Hiển thị thông tin
    void hienThiThongTin() {
        System.out.println("MSSV: " + maSV + " - Ho ten la: " + hoTen);
    }

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("001", "ttmkhoa", 10);

        sv1.hienThiThongTin();
    }
}