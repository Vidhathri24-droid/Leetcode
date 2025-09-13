class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
                sum += nums[i];
        }
        
        int average = sum / nums.length;
        int small = 1;
        if (average <= 0){
            small = 1;
        } else {
            small = average + 1;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == small){
                small = nums[i]+1;
            }
        }
    return small;
    }
}
