package week7.task1;

public class Division {
    private Expression left, right;

    public Expression Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        Numeral result = new Numeral(left.evaluate()/right.evaluate());
        return result;
    }

    public String toString() {
        return "Division: " + left.toString() + ", " + right.toString();
    }
}
