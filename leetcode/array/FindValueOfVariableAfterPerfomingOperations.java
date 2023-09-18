package leetcode.array;

public class FindValueOfVariableAfterPerfomingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(String valueString : operations) {
            if(valueString.contains("++")) {
                value++;
            }else if(valueString.contains("--")) {
                value--;
            }
        }
        return value;
    }
}
