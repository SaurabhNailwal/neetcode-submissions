class Solution {
    public boolean isValid(String s) {

        Stack<Character> bracketStack = new Stack();

        for(char c: s.toCharArray()){
            if(c ==')' || c == '}' || c==']'){

                if(bracketStack.isEmpty()){
                    return false;
                }
                char bracket = bracketStack.pop();

                if(c == ')' && bracket !='('){
                    return false;
                } else if(c == '}' && bracket !='{'){
                    return false;
                } else if(c == ']' && bracket !='['){
                    return false;
                }

            }else{
                bracketStack.push(c);
            }
        }

        if(!bracketStack.isEmpty()){
            return false;
        }

        return true;
        
    }
}
