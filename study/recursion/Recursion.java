package study.recursion;

import java.util.List;

public class Recursion {
    public static Integer num = 2;

    public static void searchToTheKey(List<Integer> list) {
        num++;
        for (Integer valor : list) {
            if (valor != 7) {
                System.out.println("Procure na lista até achar o 7");
                searchToTheKey(List.of(num));  // Caso recursivo
            } else {
                System.out.println("Achei o " + valor);  // Caso base
            }
        }
    }

    public static void imprima(int i){
        System.out.println(i);
        if (i <= 1) {
            return; // caso base
        }else {
            imprima(i -1); // caso recursivo
        }
    }
}
