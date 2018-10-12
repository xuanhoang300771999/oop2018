package week4.task2;

public class Square extends Rectangle{

    public Square() {

    }

    public Square(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public String toString() {
        return "Square\nSide: " + getLength() + "\n"
                + super.toString() + "\n";
    }
}
