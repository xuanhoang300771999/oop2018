package week7.task1;

public class Square extends Expression {
    private Expression expression;


    public Square(Expression expression) {
        this.expression = expression;
    }

    public String toString(){
        return "Expression " + expression.toString();
    }

}
