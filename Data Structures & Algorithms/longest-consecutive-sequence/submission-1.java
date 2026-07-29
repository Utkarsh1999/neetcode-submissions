class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) {
            numSet.add(num);
        }

        int longest = 0;

        for(int num: numSet) {
            if(!numSet.contains(num-1)) {
                int len = 1;
                while(numSet.contains(num+len)) {
                    len++;
                }

                longest = Math.max(longest, len);
            }
        }

        return longest;



    }
}
/*
    input: [2,20,4,10,3,4,5]
    output: 4

    -> find the largest number, and smallest number
    -> define the array with the length of largest number
    -> traverse the array, and start putting numbers in array and 
    ----> keep the pointer to track the count
    -> also keep the max length pointer for max size
    -> reset only the current length pointer, and then return the max length pointer
*/
