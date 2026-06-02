class Solution {
    public int trap(int[] height) {

        //create 1 array with max val from reverse 
        // and 1 array with max val from start

        int len = height.length;

        if(len < 3){
            return 0;
        }

        int[] maxFromLastElem = new int[len];

        int maxElement = 0;

        for(int i=len-1; i >=0; i--){

            maxElement = Math.max(height[i], maxElement);

            maxFromLastElem[i] = maxElement;
        }

        int[] maxFromFirstElem = new int[height.length];
        maxElement = 0;
        for(int i=0; i< len; i++){

            maxElement = Math.max(height[i], maxElement);
            maxFromFirstElem[i] = maxElement;

        }

        int area = 0;
        //Calculate final area

        for(int i=1; i< len-1; i++){
            area += Math.min(maxFromFirstElem[i], maxFromLastElem[i]) - height[i];
        }

        return area;
    }
}
