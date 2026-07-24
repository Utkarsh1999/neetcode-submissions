class Solution {

    public String encode(List<String> strs) {
        StringBuilder strBuilder = new StringBuilder();

        for(int i=0;i<strs.size(); i++) {
            String curr = strs.get(i);

            strBuilder.append(curr.length());
            strBuilder.append("#");
            strBuilder.append(curr);
        }

        return strBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        int i=0;
        while(i<str.length()) {
            int j = i;

            while(str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));

            // int len = Character.getNumericValue(str.charAt(i));
            j++;
            String subStr = str.substring(j, j+len);
            list.add(subStr);

            i = j+len;
        }

        return list;
    }
}
/*
input: strs = ["Hello","World", "abc"]

encode logic: count length of current string and append length+currentString in output string

outstring: "5Hello5World3abc"


decode: 
i=0: ch: 5

extract substring between i and i+Integer.parseInt(ch) -> substring

insert it into array

update i = i+chLength+1

if i is in valid range:




*/