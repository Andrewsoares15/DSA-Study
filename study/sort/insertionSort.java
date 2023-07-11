package study.sort;

public class insertionSort {

    public static void main(String[] args) {
        insertionSort(new int[]{2, 5, 6, 4, 8, 1});
    }

    public static void insertionSort(int[] values) {
        for (int i = 1; i < values.length; i++) {

            int j = i;

            while (j > 0 && values[j] < values[j-1]) {
                int aux = values[j];
                values[j] = values[j - 1];
                values[j - 1] = aux;
                j -= 1;
            }

        }
    }
}
