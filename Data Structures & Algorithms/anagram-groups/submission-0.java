class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            int[] freq = new int[26];

            for(char ch: str.toCharArray()) {
                freq[ch-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int count: freq) {
                sb.append(count).append('#');
            }

            String key = sb.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

        }

        return new ArrayList<>(map.values());

    }
}
// ["act","pots","tops","cat","stop","hat"]
/* number of unique anagrams x anagram words
    act ->
        a - 1
        c - 1
        t - 1

    pots ->
        p - 1
        o - 1
        t - 1
        s - 1


        every anagram will have unique key, we can use that to group them

*/