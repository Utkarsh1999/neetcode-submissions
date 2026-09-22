class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int result;
        for(String str: tokens) {
            if(str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")) {
                //perform operation and store back the result in stack
                if(st.size() < 2) {
                    return -1;
                }

                Integer b = st.pop();
                Integer a = st.pop();

                if(str.equals("+")) {
                    st.push(a+b);
                } else if(str.equals("-")) {
                    st.push(a-b);
                } else if(str.equals("/")) {
                    st.push(a/b);
                } else if(str.equals("*")) {
                    st.push(a*b);
                }
            } else {
                st.push(Integer.parseInt(str));
            }
        }
        return st.pop();
    }
}
