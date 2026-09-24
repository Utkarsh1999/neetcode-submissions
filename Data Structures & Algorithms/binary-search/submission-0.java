class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end) {
            int mid = (start+end)/2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid]<target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }
}
/*
    nums = [-1,0,2,4,6,8] target = 4
    start = 0 end = 5
    mid = 5-0/2 = 2

    target > [mid]
    start = mid = 2 end = 5
    mid = 7/2 = 3

*/
