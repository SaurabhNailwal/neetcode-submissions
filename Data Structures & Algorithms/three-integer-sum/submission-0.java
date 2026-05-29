class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList();

        Arrays.sort(nums);

        // target is negative of current index value
        int len = nums.length;
        for(int i=0; i< nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int left = i+1;
            int right = len - 1;

            while(left < right){
                int sum = nums[left]+nums[right];
                if(sum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return result;

    }
}
