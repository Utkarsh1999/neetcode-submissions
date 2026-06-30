class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[2];
        
    }
}
// nums[i] + nums[j] = target
// if i am at ith position, i want to know if there's any existence of nums[j] at some jth position
// where i!=j
// nums[j] = nums[i] - target 
// else i'll save nums[i] at ith position
