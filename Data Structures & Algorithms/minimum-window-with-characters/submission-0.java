class Solution {
    public String minWindow(String s, String t) {

        int[] requiredFreq = new int[128];
        int[] windowFreq = new int[128];

        // 1. Store frequency of characters required from t
        for (char ch : t.toCharArray()) {
            requiredFreq[ch]++;
        }

        int left = 0;
        int matched = 0;

        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        // 2. Expand the window
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            windowFreq[ch]++;

            // This occurrence actually satisfies a required character
            if (windowFreq[ch] <= requiredFreq[ch]) {
                matched++;
            }

            // 3. Window is valid → start shrinking
            while (matched == t.length()) {

                // Store the smallest valid window
                int windowLength = right - left + 1;

                if (windowLength < minLength) {
                    minLength = windowLength;
                    minStart = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);
                windowFreq[leftChar]--;

                // Removing this character made the window invalid
                if (windowFreq[leftChar] < requiredFreq[leftChar]) {
                    matched--;
                }

                left++;
            }
        }

        // 4. No valid window found
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minLength);
    }
}
/*
    s = "OUZODYXAZV", t = "XYZ"

    1. iterate t, store windowFreq
    2. iterate s, keep on expanding until there's a match, store the substring
    3. start shrinking the window from left until the window is valid, and keep on optimising the window size
    4. if the window become invalid, resume expanding it again
    5. return the minimum window string stored
*/
