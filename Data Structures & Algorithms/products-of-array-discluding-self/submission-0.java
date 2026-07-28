class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ltr = new int[len];
        int[] rtl = new int[len];

        ltr[0] = 1;
        rtl[len-1] = 1;
        //ltr
        for(int i=1; i<len; i++) {
            ltr[i] = ltr[i-1]*nums[i-1]; 
        }

        //rtl
        for (int i=len-2; i >=0; i--) {
            rtl[i] = rtl[i+1]*nums[i+1];
        }

        //final computation
        for(int i=0;i<len;i++) {
            ltr[i] = ltr[i]*rtl[i];
        }

        return ltr;

    }
}  

/*
    [1,2,4,6]

    product from left: [1, 2, 8, 48]
    product from right: [48,48,24,6]

    product: [48, 24, 6,]

    [48,24,12,8]



    [-1,0,1,2,3]

    []

*/
