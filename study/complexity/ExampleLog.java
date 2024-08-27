package study.complexity;

public class ExampleLog {

    public static void main(String[] args) {
        final var value = 8;

        for (int i = 0; i < value; i *= 2) {
            System.out.println("Time complexity = O(log n)");
        }

        for (int i = 0; i < value; i /= 2) {
            System.out.println("Time complexity = O(log n)");
        }

        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j *= 2) {
                System.out.println("Time complexity = O(n log n)");
            }
        }


    }
}
