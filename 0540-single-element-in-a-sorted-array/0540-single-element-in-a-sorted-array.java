class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left =0;
        int right = nums.length-1;

        while(left<right){
            int mid = (left + right)/2;

            if(mid%2 != 0){
                mid--;
            }

            //mid != right neighbor then ele must be on left side 
            if(nums[mid] != nums[mid+1]){
                right = mid;
            }
            else{
                left = mid+2;
            }
        }
        return nums[left];
    }
}