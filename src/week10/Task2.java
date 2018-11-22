package week10;

import java.util.Random;


public class Task2 {
    static double[] arr = new double[1000];
    static Random random = new Random();

    static void sort(double arr[]) {
        for (int i = 0; i < 1000; i++)
            arr[i] = random.nextDouble();
        for (int i = 0; i < 1000; i++) {
            for (int j = i + 1; j < 1000 - i; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        sort(arr);
        for (double i : arr) {
            System.out.print(i + " ");
        }
    }
}
