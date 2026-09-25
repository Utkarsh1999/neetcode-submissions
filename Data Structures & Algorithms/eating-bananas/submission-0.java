class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = getMax(piles);

        while(start<end) {
            int mid = start + (end-start)/2;
            if(isValid(mid, piles, h)) {
                end = mid;
            } else {
                start = mid+1;
            }
        }

        return start;
    }

    private boolean isValid(int k, int[] piles, int h) {
        if(k==0) {
            return false;
        }
        int total =0;
        for(int i=0; i<piles.length;i++) {
            total = total + ((piles[i]+k-1)/k);
        }

        return total <= h;
    }

    private int getMax(int[] piles) {
        int max = 0;
        for(int i=0; i<piles.length; i++) {
            max = Math.max(piles[i], max);
        }
        return max;
    }
}
/*
    piles = [1,4,3,2], h = 9
    s
    banana eating rate: 1 <= k <= max banana in a pile
*/