class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i: nums) {
            freq.put(i, 1+freq.getOrDefault(i, 0));
        }

        int[] res = new int[k];


        //let's create a maxHeap
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>(
            (a,b) -> a.getValue().equals(b.getValue()) ? Integer.compare(b.getKey(), a.getKey()) :
                Integer.compare(b.getValue(), a.getValue())
        );

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            maxHeap.offer(entry);
        }

        for(int i=0;i<k;i++) {
            res[i] = maxHeap.poll().getKey();
        }

        return res;
    }
}
/*
    [1,2,2,3,3,3]

    1 -> 1
    2 -> 2
    3 -> 3


    // counting sort or maxHeap on frequencies?

*/