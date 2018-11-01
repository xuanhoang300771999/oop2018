package week7.task2;

import week7.task1.Addition;

import java.io.*;


public class Task2 {

    static void TestNullPointerException() throws NullPointerException {
        String a = null;
        System.out.println(a.length());
    }

    static void TestArithmeticException() throws ArithmeticException {
        System.out.println(7 / 0);
    }

    static void TestFileNotFoundException() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("H:\\GitHub\\oop2018\\src\\week7.pdf");
    }

    static void TestArrayIndexOfBoundException() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println(arr[0] + arr[4]);
    }

    static void TestClassCastException() throws ClassCastException {
        Object obj = new Object();
        Addition addition = (Addition) obj;
    }

    static void TestIOException() throws IOException {
        String file = "C:\\GitHub\\oop2018\\src\\week7\\task2";
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(file));
    }

    public static void main(String[] args) {
        //NullPointerException
        try {
            TestNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException\n");
        }

        //ArithmeticException
        try {
            TestArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException\n");
        }

        //FileNotFoundException
        try {
            TestFileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException\n");
        }

        //ArrayIndexOfBoundException
        try {
            TestArrayIndexOfBoundException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOfBoundException\n");
        }

        //ClassCastException
        try {
            TestClassCastException();
        } catch (ClassCastException e) {
            System.out.println("ClassCastException\n");
        }
        //IOException
        try {
            TestIOException();
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }


}
