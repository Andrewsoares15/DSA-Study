package study.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QuickSort {

    public static void main(String[] args) {
        quickSort(List.of(10, 3, 1, 5, 15, 11)).forEach(System.out::println);

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
}
