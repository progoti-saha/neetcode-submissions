class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Frequency buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        // Get k most frequent
        int[] ans = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {
                for (int num : bucket[i]) {

                    ans[index] = num;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return ans;
    }
}