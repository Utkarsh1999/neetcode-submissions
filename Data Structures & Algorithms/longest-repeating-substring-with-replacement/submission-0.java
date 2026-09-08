class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int[] map = new int[26];
        int maxFreq = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            map[ch-'A']++;

            maxFreq = Math.max(maxFreq, map[ch-'A']);
            int windowSize = right-left+1;

            if(windowSize - maxFreq >k) {
               //invalid window
                char ch2 = s.charAt(left);
                map[ch2-'A']--;
                left++;
            } 

            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}

/*
    s = "XYYX", k = 2

    s = "AAABABB", k = 1


*/