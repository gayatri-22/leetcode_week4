class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target)
                  return true;
            }
        }
        return false;*/

        for(int i=0;i<matrix.length;i++){
           int n = matrix[i].length-1;

           if(target<=matrix[i][n]){
               int start =0;
               int end = n;

               while(start<=end){
                   int mid=start+(end-start)/2;

                   if(matrix[i][mid]==target){
                       return true;
                   }

                   else if(matrix[i][mid]<target){
                       start=mid+1;
                   }
                   else{
                       end = mid-1;
                   }
               }
           }
        }
        return false;
    }
}