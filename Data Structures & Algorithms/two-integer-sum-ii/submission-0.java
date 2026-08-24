class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<right) {
            int sum = numbers[left] + numbers[right];
            //equal
            if(sum == target) {
                return new int[]{left+1, right+1};
            } else if(sum<target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[2];
    }
}
/*
 nums = [1,2,3,4] target = 3


*/