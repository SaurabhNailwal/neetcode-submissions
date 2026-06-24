class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> rpnStack = new Stack();
        Set<String> operatorSet = Set.of("+","-","*","/");


        for(String token: tokens){
            if( operatorSet.contains(token)){
                int val2 = rpnStack.pop();
                int val1 = rpnStack.pop();
                int result = calculate(val1, val2, token);
                rpnStack.push(result);
                
            }else{
                rpnStack.push(Integer.valueOf(token));
            }

        }

        return rpnStack.pop();
        
    }

    private int calculate(int val1, int val2, String operator){

        int result = 0;
        
        if(operator.equals("+")){
            result = val1+val2;
        }else if(operator.equals("-")){
            result = val1-val2;
        }else if(operator.equals("*")){
            result = val1*val2;
        }else if(operator.equals("/")){
            if(val2 == 0){
                return Integer.MAX_VALUE;
            }
            result = val1/val2;
        }

        return result;
    }
}
