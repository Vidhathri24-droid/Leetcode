class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for (int i= 0; i < n; i++){
            if (max < nums[i]){
                max = nums[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++){
            count = count + max - nums[i];
        }

        return count;
    }
}
