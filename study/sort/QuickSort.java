package study.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// QuickSort utilizando o particionamento LOMUTO
public class QuickSort {

    public static void main(String[] args) {
//        quickSort(List.of(10, 3, 1, 5, 15, 11)).forEach(System.out::println);
        var list = new int[]{10, 3, 1,5, 15, 9};
        quickSort(list, 0, list.length - 1);
        for (int num: list) {
            System.out.println(num);
        }
    }

    static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() < 2)
            return arr;

        int pivo = arr.get(0);

        List<Integer> menores = arr.stream().filter(num -> num < pivo).collect(Collectors.toList());
        List<Integer> maiores = arr.stream().filter(num -> num > pivo).collect(Collectors.toList());

        return Stream.concat(
                Stream.concat(quickSort(menores).stream(), Stream.of(pivo)),
                quickSort(maiores).stream()).collect(Collectors.toList());

    }

    static int[] quickSort(int[] arr) {
        if (arr.length < 2)
            return arr;

        int pivo = arr[0];

        int[] menores = Arrays.stream(arr).filter(num -> num < pivo).toArray();
        int[] maiores = Arrays.stream(arr).filter(num -> num > pivo).toArray();

        IntStream intStream = IntStream.concat(Arrays.stream(quickSort(menores)), Arrays.stream(new int[]{pivo}));
        return IntStream.concat(intStream, Arrays.stream(quickSort(maiores))).toArray();

    }

    static void quickSort(int[] v, int left, int right) {
        if (left < right) {
            int index_pivot = partition(v, left, right);
            quickSort(v, left, index_pivot - 1);
            quickSort(v, index_pivot + 1, right);
        }
    }

    static int partition(int[] v, int left, int right) {

        int indexPivot = pickPivotIndex(v, left, right);

        // swap first and pivot
        int aux = v[left];
        v[left] = v[indexPivot];
        v[indexPivot] = aux;

        int pivot = v[left];
        int i = left;

        for (int j = i + 1; j <= right; j++) {
            if (v[j] <= pivot) {
                i+=1;
                aux = v[i];
                v[i] = v[j];
                v[j] = aux;

            }
        }

        aux = v[left];
        v[left] = v[i];
        v[i] = aux;

        return i;

    }
    // medianOfThree
    static int pickPivotIndex(int[] values, int left, int right) {
        int mid = (left + right) / 2;

        int[] sorted = {values[left], values[mid], values[right]};
        Arrays.sort(sorted);

        if (sorted[1] == values[left]) return left;
        else if (sorted[1] == values[mid]) return mid;
        else return right;
    }
}
