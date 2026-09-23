class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++) {
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int j = st.pop();
                result[j] = i-j;
            }
            st.push(i);
        }

        return result;
    }
}
/*
                    0  1  2  3  4  5  6
    temperatures = [30,38,30,36,35,40,28]
    monotonic stack:
    


    curr = 28
    i = 
*/
