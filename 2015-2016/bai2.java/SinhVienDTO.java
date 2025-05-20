

public class SinhVienDTO {
    private int maSV;
    private String Ho,Ten,NgaySinh,GioiTinh;
    public String getGioiTinh() {
        return GioiTinh;
    }public String getHo() {
        return Ho;
    }public int getMaSV() {
        return maSV;
    }public String getNgaySinh() {
        return NgaySinh;
    }public String getTen() {
        return Ten;
    }public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }public void setHo(String ho) {
        Ho = ho;
    }public void setMaSV(int maSV) {
        this.maSV = maSV;
    }public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }public void setTen(String ten) {
        Ten = ten;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
