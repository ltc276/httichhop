class NhanVien {
    protected String hoTen;
    protected String cccd;
    protected double luongCB;
    public NhanVien(String hoTen, String cccd, double luongCB) {
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.luongCB = luongCB;
    }
    public double tinhLuong() {
        return 0;
    }
}

class NhanVienToanThoiGian extends NhanVien {
    private double luongThang;

    @Override
    public double tinhLuong() {
        return luongThang;
    }
}