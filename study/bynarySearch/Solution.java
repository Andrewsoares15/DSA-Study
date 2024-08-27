package study.bynarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String[][] mat = {{"A", "B", "G", "E"}, {"S", "F", "C", "S"}, {"A", "D", "E", "E"}};
        var word = "ABCC";

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        GetOptimalContentStorage(list);

        System.out.println(solution(mat, word));

    }
    public static boolean solution(String[][] mat, String word) {
        var hashMap = new HashMap<String, Character>();
        StringBuilder res = new StringBuilder();

        for(Character letter : word.toCharArray()){

            for(int i = 0; i < mat.length; i++){

                boolean achou = false;

                for(int j = 0; j < mat[0].length; j++){

                    if(hashMap.containsKey(""+i+j)) continue;

                    if(mat[i][j].equals(letter.toString())){
                        res.append(mat[i][j]);
                        hashMap.put(""+i+j, letter);
                        achou = true;
                        break;
                    }
                }
                if(achou) break;
            }

        }
        System.out.println(res);
        return res.toString().equals(word);
    }

    public static int GetOptimalContentStorage(List<Integer> tiktokStorage) {
        var array = tiktokStorage.toArray();
        int left = 0;
        int right = tiktokStorage.size() - 1;
        int count = 0;
        // left = 0; right = 4
        while(left < right){ // 0 < 4 // 1 < 4 // 2 < 3

            if((int) array[left] != 0){ // 1 != 0 // 0 != 0 // 1 != 0
                left++;// left = 1 // left = 3
                continue;
            }else if((int) array[right]  != 1){ // 1 != 1
                right--;
                continue;
            }

            var aux = array[left]; // 0 index 1
            array[left++] = array[right]; // add 1 at index 1
            array[right--] = aux;// add 0 to index 4
            count++; // 1
        }
        return count;
    }



}