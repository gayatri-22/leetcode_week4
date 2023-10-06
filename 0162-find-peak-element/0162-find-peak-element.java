class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int start=1; // first ele is also checked
        int end = n-2; //coz last ele is checked

        if(n ==1){
            return 0;
        }

        //check for 0th and last ele
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;

        while(start<=end){
            int mid= start+(end-start)/2;

            if(nums[mid] > nums[mid+1]  && nums[mid] > nums[mid-1]){
                return mid;
            }

            else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}