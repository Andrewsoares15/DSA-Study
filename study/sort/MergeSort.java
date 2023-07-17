package study.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] ints = {6, 2, 4, 9, 12, 1};
        mergeSort(ints, 0, ints.length - 1);
    }

    static void mergeSort(int[] v, int left, int right){
        if (left >= right)
            return;

        else {

            int middle = (left + right) / 2;
            mergeSort(v, left, middle);
            mergeSort(v, middle + 1, right);

            merge(v, left, middle, right);
        }
    }

    // a gente recebe esse array, com as duas metades ordenadas
    // e nosso objetivo é fazer o merge dessas duas metades já ordenadas,
    // trannsformando em um array totalmente ordenado
    static void merge(int[] v, int left, int middle, int right){

        // transfere os elementos entre left e right para um array auxiliar.
        int[] helper = new int[v.length];
        for (int i = left; i <= right; i++) {
            helper[i] = v[i];
        }

        int i = left; // inicio da primeira parte do array
        int j = middle + 1; // inicio da segunda parte do array
        int k = left; // marca a posição em que o menor elemento entre helper[i] e helper[j] deve ser adicionado

        while (i <= middle && j <= right) {

            if (helper[i] <= helper[j]) {
                v[k] = helper[i];
                i++;
            } else {
                v[k] = helper[j];
                j++;
            }
            k++;

        }

        // se a metade inicial não foi toda consumida, faz o append.
        while (i <= middle) {
            v[k] = helper[i];
            i++;
            k++;
        }

        // se a metade final não foi toda consumida, faz o append.
        while (j <= right) {
            v[k] = helper[j];
            j++;
            k++;
        }
    }
}
