class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Maintain map for target minus the traversed number 
        Map<Integer, Integer> targetDiffMap = new HashMap();

        for(int i=0; i< nums.length;i++){
            int diff = target - nums[i];
            if(targetDiffMap.containsKey(nums[i])){
                return new int[]{targetDiffMap.get(nums[i]), i};
            }

            //not found, make entry in map
            targetDiffMap.put(diff, i);

        }

        return null;
        
    }
}
