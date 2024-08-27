package leetcode.stack;

import java.util.Stack;

public class StackIsValid {
    public boolean isValid(String s) {
        if(s.length() <= 1){
            return false;
        }
        Stack<Character> stackString = new Stack<>();
        for(char value1 : s.toCharArray()){
            if(value1 == '(' || value1 == '{' || value1 == '['){
                stackString.push(value1);
            }else{
                if (stackString.empty()) {
                    return false;
                }
                var valueTop = stackString.peek();
                if(value1 == ']' && valueTop == '['){
                    stackString.pop();
                }else if(value1 == '}' && valueTop == '{' ){
                    stackString.pop();
                }else if(value1 == ')' && valueTop == '('){
                    stackString.pop();
                }else{
                    return false;
                }

            }

        }
        return stackString.empty();
    }
}
