class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] windowFreq = new int[26];
        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            windowFreq[ch-'a']++;
        }

        int left = 0;
        for(int right=0; right<s2.length(); right++) {
            char ch = s2.charAt(right);
            freq[ch-'a']++;

            if(right-left+1>s1.length()) {
                //window is invalid, shrink it
                char ch2 = s2.charAt(left);
                freq[ch2-'a']--;
                left++;
            } 

            if(Arrays.equals(freq, windowFreq)) {
                return true;
            }
        }

        return false;
    }
}
/*
    s1 = "abc", s2 = "lecabee"
    out: true

    iterate s2 and store the character frequency in array 
    iterate s1 and keep on reducing the frequency by 1. if at any time, frequency is 0, return false else after the iteration
    return true
*/