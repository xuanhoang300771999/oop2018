package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;
    // Phương thức lấy tử số
    public int getNumerator() {
        return numerator;
    }
    // Phương thức truyền tử số
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    // Phương thức lấy mẫu số
    public int getDenominator() {
        return denominator;
    }
    // Phương thức truyền mẫu số
    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
        else {
            System.out.println("Mẫu số = 0. Vui lòng kiểm tra lại.");
            setNumerator(denominator);
        }
    }


    // Contructor không chứa tham số!

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0, 0);
        result.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        result.denominator = this.denominator * other.denominator;
        return result;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
            Fraction result = new Fraction(0, 0);
            result.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
            result.denominator = denominator * other.denominator;
            return result;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0, 0);
        result.numerator = this.numerator * other.numerator;
        result.denominator = this.denominator * other.denominator;
        return result;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0, 0);
        result.numerator = this.numerator * other.denominator;
        result.denominator = this.denominator * other.numerator;
        return result;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        if(this.numerator * ((Fraction) obj).denominator != this.denominator*((Fraction) obj).numerator )
            return false;
        return true;
    }

}
