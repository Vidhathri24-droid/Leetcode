import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        for (int l=0; l < nums.length / 2; l++){
            int x = nums[l];
            nums[l] = nums[nums.length - 1 -l];
            nums[nums.length - 1 -l] = x;
        }
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (i==0 || nums[i] != nums[i-1]){
                temp[j++] = nums[i];
            }
        }
        int[] uniqueArr = Arrays.copyOf(temp,j);
        int n = 0;
        if (uniqueArr.length < k){
            n += uniqueArr.length;
            }
         else {
            n += k;
        }
        int[] sum = new int[n];
        for (int m = 0; m < n; m++){
                sum[m] = temp[m];
}
    return sum;
    }
}
