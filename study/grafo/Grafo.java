package study.grafo;

import java.util.*;

public class Grafo {

    private static HashMap<String, List<Amigo>> graph = new HashMap<>();

    public static void main(String[] args) {
        graph.put("you", List.of(new Amigo(false, "Bastos"), new Amigo(false, "Rayele"), new Amigo(false, "Nenê")));
        graph.put("Bastos", Collections.emptyList());
        graph.put("Rayele", Collections.emptyList());
        graph.put("Nenê", List.of(new Amigo(false, "Ribamar"), new Amigo(false, "Batman"), new Amigo(false, "Melyssa")));
        graph.put("Ribamar", Collections.emptyList());
        graph.put("Batman", Collections.emptyList());
        graph.put("Melyssa", Collections.emptyList());

        System.out.println(search("you"));


    }

    private static String search(String name){
        Deque<Amigo> searchQueue = new ArrayDeque<>(graph.get(name));
        List<Amigo> searched = new ArrayList<>();

        while (!searchQueue.isEmpty()){
            Amigo friend = searchQueue.poll(); // get and remove the first element of a queue
            if (!searched.contains(friend)){
                if(friend.isSeller()){
                    return friend.getNome();
                }else {
                    searchQueue.addAll(graph.get(friend.getNome()));
                    searched.add(friend);
                }
            }
        }
        return "UNKNOWN";
    }

    static class Amigo{
        private boolean IsSeller;
        private String nome;

        public boolean isSeller() {
            return IsSeller;
        }

        public String getNome() {
            return nome;
        }

        Amigo(boolean isSeller, String nome) {
            IsSeller = isSeller;
            this.nome = nome;
        }
    }
}
