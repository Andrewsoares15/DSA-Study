package study.grafo;

import java.util.HashMap;
import java.util.List;

public class Grafo {
    public static void main(String[] args) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        hashMap.put("Alice", List.of("Bastos", "Rayele", "Carla"));
        hashMap.put("Nenê", List.of("Ribamar", "Batman", "Melyssa"));

        for (List<String> list :hashMap.values()) {
            list.stream().filter(value -> value.equals("Melyssa")).forEach(System.out::println);

        }
    }
}
