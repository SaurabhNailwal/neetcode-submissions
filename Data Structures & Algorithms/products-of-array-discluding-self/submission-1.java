class Solution {
    public int[] productExceptSelf(int[] nums) {

        //find product
        int product = 1;
        int zeroCount = 0;

        for(int num: nums){
            if(num == 0){
                zeroCount++;
            }else{
                product *= num;
            }     
            
        }

        //store sum by dividing current num from product
        int[] result = new int[nums.length];

        if(zeroCount > 1){
            return result;
        }

        for(int i=0; i< nums.length; i++){
            if(zeroCount > 0){
                result[i] = (nums[i] == 0)? product: 0;
            }else{
                result[i] = product/nums[i];
            }
        }
        
        return result;
    }
}  
