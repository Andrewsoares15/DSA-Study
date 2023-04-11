package study.hash;

import java.util.HashMap;

public class Hash {

    public static void main(String[] args) {
//        var integerStringHashMap = new HashMap<>();
//        integerStringHashMap.put("Laranja", 2.57);
//        integerStringHashMap.put("banana", 2L);
//        integerStringHashMap.put("banana", 3L);
//        System.out.println(integerStringHashMap.get("banana"));
        System.out.println(verifyVote("Andrew"));
    }

    static String verifyVote(String nome) {
        var integerStringHashMap = new HashMap<>();
        integerStringHashMap.put("Andrew", true);
        integerStringHashMap.put("Gaby", false);
        integerStringHashMap.entrySet();

        if (integerStringHashMap.get(nome) != null) {
            return "Vaza! você já votou!";
        }
        return "Primeiro voto! Liberado!!";
    }
}
