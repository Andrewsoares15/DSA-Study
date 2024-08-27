package study.complexity;

import java.time.LocalDateTime;

public class teste {

    public static void main(String[] args) {
        System.out.println("teste = ");
        int n = 10;
        int answer = 0;
        LocalDateTime end_time = LocalDateTime.now().plusSeconds(n);
        while (LocalDateTime.now().isBefore(end_time)) {
            System.out.println("answer = " + answer);
            answer = 41 + 1;
        }
        System.out.println("answer = " + answer);


    }
}
