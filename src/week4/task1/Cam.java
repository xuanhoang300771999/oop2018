package week4.task1;

public class Cam extends HoaQua {
    private String mau;
    private long soluong;

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public long getSoluong() {
        return soluong;
    }

    public void setSoluong(long soluong) {
        this.soluong = soluong;
    }

    public Cam() {

    }

    public Cam(String mau, long soluong) {
        mau = "xanh";
        soluong = 2456023;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Mau cua Cam: " + mau);
        System.out.println("So Luong cua Cam: " + soluong);
    }

}