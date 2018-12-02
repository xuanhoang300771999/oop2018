package week12;

public class sortAlgorithm {
    int[] arr = {4, 5, 2, 1, 6, 7, 3};
    private Sort sort;

    public sortAlgorithm(Sort sort) {
        this.sort = sort;
        this.sort.Sort(arr);
        this.sort.Print(arr);
    }
}
