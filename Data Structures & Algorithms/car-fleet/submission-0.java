class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];

        for(int i=0; i<n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a,b) -> Integer.compare(a[0], b[0]));

        int fleet = 0;
        double lastTime = 0;

        for(int i=n-1;i>=0;i--) {
            double time = (double)(target-cars[i][0])/cars[i][1];

            if(time > lastTime) {
                fleet++;
                lastTime = time;
            }
        }
        return fleet;
    }
}
/*
    target(distance) = 10, position = [4,1,0,7], speed = [2,2,1,1]

    0   1   2   3   4   5   6   7 --- 10 target
    -   -           -           -
    1   2           2           1

    10s 4.5s        3s          3s

                              

        distance = speed x time
        time = distance/speed


        
        
        3
        4.5
        10

        next element is smaller -> push in stack
        next element is greater or equal -> pop from stack and add new element

        result would be stack size


    
*/
