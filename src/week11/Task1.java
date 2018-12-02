package week11;

public class Task1 {
    public static <T extends Comparable> void Sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min_index]) < 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 3, 2, 4, 1};
        Sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        Character[] arr1 = {'f', 'w', 'q', 'a'};
        Sort(arr1);
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
    }
}