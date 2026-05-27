class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length < 2){
            return nums.length;
        }

        Arrays.sort(nums);

        int streak = 1;
        int currStreak = 1;

        for(int i=1;i<nums.length; i++){

            if(nums[i-1] == nums[i]){
                continue;
            }
            if(nums[i-1]+1 == nums[i]){
                currStreak++;
                if(currStreak > streak){
                    streak = currStreak;
                }
            }else{
                currStreak = 1;
            }

        }

        return streak;
        
    }
}
