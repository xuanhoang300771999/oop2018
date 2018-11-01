package week7.task1;

public class Multiplication {
    private Expression left, right;

    public Expression Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        Numeral result = new Numeral(left.evaluate() * right.evaluate());
        Expression expression = result;
        return expression;
    }

    public String toString() {
        return "Multiplication: " + left.toString() + ", " + right.toString();
    }
}
