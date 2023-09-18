package study.complexity;

public class Examples {

    public static void main(String[] args) {
        final var value = 10;
//        for (int i = 0; i < args.length; i++) {
//            System.out.println("Time complexity = O(n)");
//        }
//        for (int i = args.length; i > 0; i--) {
//            System.out.println("Time complexity = O(n)");
//        }

        for (int i = 0; i < value; i += 2) { // aqui poderia ser 100 e o time complexity não iria mudar
            System.out.println("Time complexity = O(N)");
            // essa linha de código vai rodar n dividido por 2.
            // N / 2 = 0(N)
        }
    }

}
