class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int res = 0;

        for (int i = 0; i < n; i++){
            int countTarget = 0;
            int total = 0;
            for (int j = i; j < n; j++){
                total++;
                if(nums[j] == target) {
                    countTarget++;
                }

                if (countTarget * 2 > total){
                    res++;
                }
            }
        }
        return res;
    }
}
