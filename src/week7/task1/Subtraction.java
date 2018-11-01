package week7.task1;

public class Subtraction {
    private Expression left, right;

    public Expression Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        Numeral result = new Numeral(left.evaluate() - right.evaluate());
        Expression expression = result;
        return expression;
    }

    public String toString() {
        return "Subtraction: " + left.toString() + ", " + right.toString();
    }
}
