class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findfirst(nums,target);
        ans[1] = findlast(nums,target);
        return ans;
    }

    static int findfirst(int[] nums, int target){
        int ans = -1;

        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                end = mid-1;
            }

            else if(nums[mid]>target){
                end = mid-1;
            }

            else{
                start=mid+1;
            }
        }
        return ans;
    }

    static int findlast(int[] nums, int target){
        int ans = -1;

        int start=0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                start=mid+1;
            }

            else if(nums[mid]>target){
                end = mid-1;
            }

            else{
                start=mid+1;
            }
        }
        return ans;
    }
}