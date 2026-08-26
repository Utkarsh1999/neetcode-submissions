class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;

        int leftMax = 0;
        int rightMax = 0;

        int water = 0;
        while(left<right) {
            if(height[left] <= height[right]) {
                //process water collected till `left`
                leftMax = Math.max(height[left], leftMax);
                water = water + (leftMax-height[left]);
                left++;
            } else {
                rightMax = Math.max(height[right], rightMax);
                water = water + (rightMax-height[right]);
                right--;
            }
        }

        return water;
    }
}
/*
    height = [0,2,0,3,1,0,1,3,2,1]
    area = length x breadth/width
    2 - 0 - 3-> 2 x (3-1-1 = 1) = 2
    3 - 1 - 0 - 1 - 3 -> 
*/
