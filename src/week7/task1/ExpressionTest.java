package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        Numeral numeral1 = new Numeral(1);
        Numeral numeral2 = new Numeral(2);
        Numeral numeral3 = new Numeral(3);
        Numeral numeral10 = new Numeral(10);
        Numeral numeral0 = new Numeral(0);

        Numeral result = new Numeral((10 * 10 - 1 + 2 * 3) *(10 * 10 - 1 + 2 * 3));
        System.out.println(result.toString());

        System.out.println(addition.Addition(numeral0,numeral2).toString());
        System.out.println(subtraction.Subtraction(numeral1,numeral2).toString());
        System.out.println(multiplication.Multiplication(numeral2,numeral3).toString());
        System.out.println(division.Division(numeral2,numeral1).toString());
        try {
            System.out.println(division.Division(numeral10, numeral0).toString());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }


    }
}
