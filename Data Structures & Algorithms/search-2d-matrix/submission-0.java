class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // find the row where the value should be and then run binary search for the row
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        for(int r=0;  r < rowLen; r++){
                if(matrix[r][colLen-1] >= target){
                    return binarySearch(matrix, r, target);
                }
        }
        
        return false;
    }

    private boolean binarySearch(int[][] matrix,int r, int target ){


        int left = 0;
        int right = matrix[0].length-1;

        while(left <= right){
            int mid = left+ (right-left)/2;

            if(matrix[r][mid] == target){
                return true;
            }else if(matrix[r][mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }


        }

        return false;

    }
}
