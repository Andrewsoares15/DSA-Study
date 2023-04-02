package study.recursion;

public class Recursion {

    static void procurePelaChave(int valor) {
        if (valor <= 7) { //caso recursivo
            System.out.println("Procure na lista até achar o 7");
            procurePelaChave(valor + 1);
        }else {
            System.out.println("Achei um valor maior " + valor); // caso base
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
