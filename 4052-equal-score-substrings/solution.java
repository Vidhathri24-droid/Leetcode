class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int total = 0;

        for (char c : s.toCharArray()){
            total += (c - 'a' + 1);
        }

        int leftScore = 0;

        for (int i = 0; i < n - 1; i++){
            leftScore += (s.charAt(i) - 'a' + 1);
            int rightScore = total - leftScore;

            if (leftScore == rightScore){
                return true;
            }

            if (leftScore > total / 2){
                break;
            }
        }
        return false;
    }
}
