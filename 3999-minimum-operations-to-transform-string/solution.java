class Solution {
    public int minOperations(String s) {
        int maxDist = 0;
        for (char c : s.toCharArray()){
            int dist = (26 - (c - 'a')) % 26;
            maxDist = Math.max(maxDist, dist);
        }
        return maxDist;
    }
}
