package week4.task1;

public class Tao extends HoaQua {
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

    public Tao(){
        mau = "red";
        soluong = 2999999;
    }

    public boolean BoiThu(){
        if(soluong > 3000000)
            return true;
        return false;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Mau cua Tao: " + mau);
        System.out.println("So luong cua Tao: " + soluong);
    }
}
