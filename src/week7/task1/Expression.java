package week7.task1;

public abstract class Expression {
    public abstract String toString();

    public int evaluate() {
        return ((Numeral) this).getValue();
    }
}
