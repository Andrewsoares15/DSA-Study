package study.sort;

public class BubbleSort {

    public static void main(String[] args) {
    bubbleSort(new int[]{2, 5,6, 11, 3, 7});
    }

    public static void bubbleSort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            boolean trocou = false;
            for (int j= 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j+1]) {
                    int aux = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = aux;
                    trocou = true;
                }
            }
            if (!trocou) return;
        }
    }
}
