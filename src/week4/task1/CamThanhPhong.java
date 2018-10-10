package week4.task1;

public class CamThanhPhong extends Cam {
    private double gia;
    private String xuatxu;

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public CamThanhPhong() {
        gia = 24000;
        xuatxu = "Nam Dinh";
    }

    public boolean Dat() {
        if (gia > 30000)
            return true;
        return false;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Gia cua Cam Thanh Phong: " + gia);
        System.out.println("Xuat xu cua Cam Thanh Phong: " + xuatxu);
    }
}
