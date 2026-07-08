class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> incStack = new Stack();

        for(int i=0; i <= n; i++){

            while(!incStack.isEmpty() &&
                (i == n || heights[incStack.peek()]> heights[i])){
                    int height = heights[incStack.pop()];
                    int width = incStack.isEmpty()? i: i-1-incStack.peek();
                    maxArea = Math.max(maxArea, height*width);
            }    
            incStack.push(i);

        }

        return maxArea;
        
    }
}
 