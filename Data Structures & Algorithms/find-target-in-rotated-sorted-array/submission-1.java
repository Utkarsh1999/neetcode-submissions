class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end) {
            int mid = start + (end-start)/2;

            if(nums[mid] == target) {
                return mid;
            }

            //left half is sorted
            if(nums[start]<=nums[mid]) {
                if(nums[start]<=target && nums[mid]>target) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(nums[mid]<target && nums[end] >= target) {
                    start = mid+1;
                } else {
                    end =  mid-1;
                }
            }
        }
        return -1;
    } 
}
/*
    nums = [3,4,5,6,1,2], target = 1
    start = 0
    end = 5
    mid = 2

    if(nums[mid] > target && nums[start] < target) {
        end=mid;
    }
*/