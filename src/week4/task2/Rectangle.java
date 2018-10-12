package week4.task2;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    //Phương thức khởi tạo không có tham số
    public Rectangle() {

    }
    // Phương thức khởi tạo chiều dài và chiều rộng
    public Rectangle(double width, double legth) {
        this.width = width;
        this.length = legth;
    }

    /**
     * @param color
     * @param filled
     * @param width
     * @param legth
     */
    public Rectangle(String color, boolean filled, double width, double legth) {
        super(color, filled);
        this.width = width;
        this.length = legth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double legth) {
        this.length = legth;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle\nWidth: " + width
                + "\nLength: " + length
                + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter()
                + super.toString() + "\n";
    }
}
