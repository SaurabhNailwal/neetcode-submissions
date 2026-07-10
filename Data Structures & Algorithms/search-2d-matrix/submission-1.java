class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // find the row where the value should be and then run binary search for the row
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int left = 0;
        int right = rowLen*colLen-1;

        while(left <= right){
            int mid = left+ (right-left)/2;

            int row = mid/colLen;
            int col = mid%colLen;

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }


        }
        
        return false;
    }
}