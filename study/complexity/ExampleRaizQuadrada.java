package study.complexity;

public class ExampleRaizQuadrada {
    public static void main(String[] args) {
        int n = 9;
        int p = 0;
        for (int i = 1; p <= n; i++) {
            p = p + i ;
            System.out.println("Time complexity = O(√n)");
            System.out.println("p = " + p);

        }
    }
}
