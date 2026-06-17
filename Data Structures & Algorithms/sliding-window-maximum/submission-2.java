class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;

        int[] output = new int[len-k+1];

        Deque<Integer> q = new LinkedList();

        int l= 0, r = 0;


        while(r < len){
            // remove index  from last which has value less than current
            while(!q.isEmpty() && nums[q.getLast()] < nums[r]){
                q.removeLast();
            }
            q.addLast(r);

            //remove beginning elements if outside window
            if(l > q.getFirst()){
                q.removeFirst();
            }

            // maintain the window
            if(r+1 >=k){
                output[l] = nums[q.getFirst()];
                l++;
            }
            r++;

        }
        
        return output;
        
    }
}
