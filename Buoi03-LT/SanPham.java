public class SanPham {

    String ma;
    String ten;
    double dg;
    int sl;
    public SanPham(String ma, String ten, double dg, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.dg = dg;
        this.sl = sl;
    }
    double tinhThanhTien() {
        return dg * sl;
    }
    void hienThiThongTin() {
        System.out.println("Ma SP: " + ma + " - Ten SP: " + ten);
        System.out.println("Don gia: " + dg);
        System.out.println("So luong: " + sl);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("SP01", "Ban phim", 350000, 2);
        SanPham sp2 = new SanPham("SP02", "Chuot", 150000, 3);
        sp1.hienThiThongTin();
        sp2.hienThiThongTin();
    }
}