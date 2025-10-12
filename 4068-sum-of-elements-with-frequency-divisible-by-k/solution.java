class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        for (int num : nums){
            if (freq.get(num) % k == 0){
                sum += num;
            }
        }
        return sum;
    }
}
