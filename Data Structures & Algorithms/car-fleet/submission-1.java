class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // Store position and speed together
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Sort by position: closest to target first
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        int count = 0;
        double maxTime = 0;

        for (int i = 0; i < n; i++) {
            double currentTime =
                (double)(target - cars[i][0]) / cars[i][1];

            if (currentTime > maxTime) {
                count++;
                maxTime = currentTime;
            }
        }

        return count;
    }
}