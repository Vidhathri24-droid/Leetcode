class Solution {
    public int countBinaryPalindromes(long n) {
        if (n == 0) return 1;
        long op = 1;
        int maxLen = Long.toBinaryString(n).length();
        for (int len = 1; len <= maxLen; len++){
            int halfLen = (len+1) / 2;

            long start = 1L << (halfLen - 1);
            long end = 1L << halfLen;
            long low = start, high = end - 1, best = start - 1;
            while ( low <= high){
                long mid = (low + high) / 2;
                long pal = buildpalindrome(mid , len % 2 == 1);

                if (pal <= n){
                    best = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (best >= start){
                op += (best - start + 1);
            }
        }
        return (int)op;
    }
    private long buildpalindrome(long half, boolean oddLen){
        long res = half;
        if (oddLen) half >>= 1;

        while (half > 0){
            res = (res << 1) | (half & 1);
            half >>= 1;
        }
        return res;
    }
}
