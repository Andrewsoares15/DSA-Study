package study.sort;

public class SelectionSort {


    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length;i++) {

            int menorIndice = i;

            for (int j = i + 1; j < list.length; j++){
                if(list[j] < list[menorIndice]){
                    menorIndice = j;
                }
            }
            int aux = list[i];
            list[i] = list[menorIndice];
            list[menorIndice] = aux;
        }
        return list;
    }

    public static void main(String[] args) {
        int array[] = {64,25,12,4,11};

        selectionSort(array);

        for (int i : array){
            System.out.println(i);
        }
    }

    public static void selectionSortt(int[] v) {
        for (int i = 0; i < v.length; i++) {

            int menorIndice = i;
            for (int j = i + 1; j < v.length; j++)
                if (v[j] < v[menorIndice])
                    menorIndice = j;

            int aux = v[i];
            v[i] = v[menorIndice]; // o indice do i recebe o menor valor que achamos -> nesse momento duplicamos o menor elemente na nossa lista
            v[menorIndice] = aux; // o antigo indice do menor elemente recebe o valor da posição que foi substituido pelo menor valor

        }
    }
}