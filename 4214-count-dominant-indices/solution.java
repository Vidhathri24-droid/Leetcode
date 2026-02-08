class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
            }
            int average = sum/(n-i);

                if(nums[i] > average){
                    count++;
                }
        }
        return count;
    }
}
