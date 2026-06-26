class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] res =  new int[temperatures.length]; 

        Stack<int []> tempStack = new Stack();

        for(int i=0;i < temperatures.length; i++){
            int t = temperatures[i];
            while(!tempStack.isEmpty() && t > tempStack.peek()[0]){
                int[] pair = tempStack.pop();
                res[pair[1]] = i - pair[1];
            }
            tempStack.push(new int[]{t, i});
        }

        return res;
    }
}
