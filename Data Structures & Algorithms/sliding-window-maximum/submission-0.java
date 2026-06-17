class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;

        int[] output = new int[len-k+1];

        for(int i=0; i< len-k+1;i++){
            int curMax = nums[i];
            for(int j=i+1; j < i+k; j++){

                curMax = Math.max(curMax, nums[j]);

            }
            output[i] = curMax;

        }

        return output;
        
    }
}
