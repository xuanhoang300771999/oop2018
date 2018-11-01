package week7.task1;

public class Addition extends BinaryExpression {
    private Expression left, right;

    public Expression Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        Numeral numeral = new Numeral(left.evaluate() + right.evaluate());
        Expression expression = numeral;
        return expression;
    }


    public String toString() {
        return "Addition: " + left.toString() + ", " + right.toString();
    }



}
