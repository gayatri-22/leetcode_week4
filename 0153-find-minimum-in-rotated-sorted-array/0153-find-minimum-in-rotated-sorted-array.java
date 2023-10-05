class Solution {
    public int findMin(int[] nums) {
         int start = 1;
        int end = nums.length-1;

        // if array is not rotated
        if(nums[start-1] <= nums[end]){
            return nums[start-1];
        }

        // if array is rotated
        while(start<=end){
            int mid = start + (end - start) /2;

            if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }

            //if left half sorted then min ele must be in right half
            else if(nums[mid]> nums[end]){
                start = mid +1;
            }

            else{
                end = mid-1;
            }
        }
        return -1;
    }
}