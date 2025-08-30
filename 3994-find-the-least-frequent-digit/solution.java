class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr = new int[100];
        if (n == 0){
            return 0;
        }
        long tempNum = n;
        while (tempNum > 0){
            int digit = (int) (tempNum % 10);
            arr[digit]++;
            tempNum = tempNum/10;
        }
        int minFreq = Integer.MAX_VALUE;
        int leastFreqDigit = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0 && arr[i] < minFreq){
                minFreq = arr[i];
                leastFreqDigit = i;
            }
        }
        return leastFreqDigit;
    }
}
