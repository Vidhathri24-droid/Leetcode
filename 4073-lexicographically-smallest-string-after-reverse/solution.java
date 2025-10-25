class Solution {
    public String lexSmallest(String s) {
        int n = s.length();
        String smallest = s;

        for (int k = 1; k <= n; k++){
            String firstRev = new StringBuilder(s.substring(0, k)).reverse().toString()+ s.substring(k);
            if(firstRev.compareTo(smallest) < 0){
                smallest = firstRev;
            }

            String lastRev = s.substring(0, n-k) + new StringBuilder(s.substring(n - k)).reverse().toString();
            if (lastRev.compareTo(smallest) < 0){
                smallest = lastRev;
            }
        }

        return smallest;
    }
}
