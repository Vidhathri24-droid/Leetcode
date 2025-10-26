class Solution {
    public long removeZeros(long n) {
        String numStr = Long.toString(n);

        String nozeros = numStr.replace("0","");

        return Long.parseLong(nozeros);
    }
}
