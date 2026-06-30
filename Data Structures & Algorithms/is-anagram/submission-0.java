class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if(s.length()!=t.length()) {
            return false;
        }
        
        // traverse the first string s
        for(int i=0; i<s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            map.put(ch1, map.getOrDefault(ch1, 0)+1);
            map.put(ch2, map.getOrDefault(ch2, 0) -1);
        }

        // so far, if the strings are anagram, the frequencies should be 0 for every character
        for(Integer val: map.values()) {
            if(val!=0) {
                return false;
            }
        }

        return true;



    }
}
// traverse the first string, save frequency of character in an array or map
// traverse the second string, for every character, reduce the frequency in array or map
// traverse the array/map to check if all the frequencies are 0, else return false;
