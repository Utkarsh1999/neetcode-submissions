class Solution {
    public int longestConsecutive(int[] nums) {
      Map<Integer, Integer> map = new HashMap<>();//track the length against the number
      int longest = 0;

      for(int num: nums) {
        if(!map.containsKey(num)) {//to ensure one number is counted only once
            int left = map.getOrDefault(num-1, 0);
            int right = map.getOrDefault(num+1, 0);
            int res = left+right+1;
            map.put(num, res);//updated the current number
            
            //let's update the boundaries
            map.put(num-left, res);
            map.put(num+right, res);

            longest = Math.max(longest, res);
        }
      }  

      return longest;
    }
}
