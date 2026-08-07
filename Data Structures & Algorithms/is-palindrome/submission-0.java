class Solution {
    public boolean isPalindrome(String s) {
             int start = 0;
             int end = s.length()-1;

     while(start<end){
        while(start<end && !isAlphaNumeric(s.charAt(start))) {
            start++;
        }

        while(end>start && !isAlphaNumeric(s.charAt(end))) {
            end--;
        }

        if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
            return false;
        }
        start++;
        end--;
     }

     return true;
    }

    public boolean isAlphaNumeric(char c) {
        return (c >='A' && c<='Z') ||
                (c>='a' && c <='z') ||
                (c>='0' && c<='9');
    }
}
/*
     start pointer -> +1
     end pointer -> -1

     while(start<end){
        while(start<end && s.charAt(start) is not alphanumeric) {
            start++;
        }

        while(end>start && s.charAt(end) is not alphanumeric) {
            end--;
        }

        if(s.charAt(start) != s.charAt(end)) {
            return false;
        }
     }

     return true;

*/
