package study.sort;

import java.util.Arrays;

public class QuickSortLomuto {


    static void quickSort(int[] v, int left, int right) {
        if (left < right) {
            int index_pivot = partition(v, left, right);
            quickSort(v, left, index_pivot - 1);
            quickSort(v, index_pivot + 1, right);
        }
    }
    public static int partition(int[] values, int left, int right) {

        int pivot = pickPivotIndex(values, left, right);
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (values[j] <= pivot) {
                i+=1;
                swap(values, i, j);
            }
        }

        // troca pivot (values[left]) com i.
        swap(values, left, i);

        return i;
    }

    private static void swap(int[] values, int i, int j) {
        int aux = values[i];
        values[i] = values[j];
        values[j] = aux;
    }

    public static int pickPivotIndex(int[] values, int left, int right) {
        int mid = (left + right) / 2;

        int[] sorted = {values[left], values[mid], values[right]};
        Arrays.sort(sorted);

        if (sorted[1] == values[left]) return left;
        else if (sorted[1] == values[mid]) return mid;
        else return right;
    }
}
