package study.grafo;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Grafo {
    public static void main(String[] args) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        hashMap.put("Alice", List.of("Bastos", "Rayele", "Nenê"));
        hashMap.put("Nenê", List.of("Ribamar", "Batman", "Melyssa"));
        hashMap.put("Bastos", Collections.emptyList());
        hashMap.put("Rayele", Collections.emptyList());
        hashMap.put("Ribamar", Collections.emptyList());
        hashMap.put("Batman", Collections.emptyList());
        hashMap.put("Melyssa", Collections.emptyList());


        for (List<String> list :hashMap.values()) {
            list.stream().filter(value -> value.equals("Melyssa")).forEach(System.out::println);
        }
    }
}
