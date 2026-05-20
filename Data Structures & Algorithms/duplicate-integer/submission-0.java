class Solution {
    public boolean hasDuplicate(int[] nums) {

        boolean dupeFound= false;

        //form hashset and look for 
        HashSet<Integer> numSet = new HashSet<>();

        for(int num: nums){

            if(numSet.contains(num)){
                return true;
            }
            numSet.add(num);

        }

        return dupeFound;
        
    }
}