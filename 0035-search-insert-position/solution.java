class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                found = true;
                index = i;
                break;
            }
        }

        if (!found){
            for (int i = 0; i < nums.length; i++){
                if (i == nums.length - 1){
                    if (i == 0 && nums[i] >= target){
                        index = 0;
                    } else{
                        index = nums.length;
                    }
                } else if (i == 0 && nums[i] > target){
                    index = 0;
                    break;
                }else if (nums[i] < target && nums[i + 1] > target){
                    index = i+1;
                    break;
                }
            }
        }
        return index;
    }
}
