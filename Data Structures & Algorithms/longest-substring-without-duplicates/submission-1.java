class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLength = Math.max(maxLength, i-left+1);

        }

        return maxLength;
    }
}
/*
    s = "pwwkew"

   

    s = pwwkew

    i = 0:
    map = {
        p
    }
    us = p

    i = 1:
    map = {
        p, w
    }
    us = pw

    i = 2:
    map = {
        p, w
    }
    us = pw
    ml = 2, map = {w}, 


    


    


*/