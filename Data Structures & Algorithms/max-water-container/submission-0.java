class Solution {
    public int maxArea(int[] heights) {

        int len = heights.length;
        int maxArea = 0;
        int left = 0;
        int right = len-1;

        for(int i=0; i<len; i++){
            maxArea = Math.max(maxArea, (right-left)* 
                Math.min(heights[left], heights[right]));

            if(heights[left]< heights[right]){
                left++;
            }else{
                right--;
            }

        }

        return maxArea;
        
    }
}
