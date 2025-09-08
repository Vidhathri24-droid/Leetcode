class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim().replaceAll("\\s"," ");
        String reversed = new StringBuilder(s).reverse().toString();
        int num = 0;
        for (int i = 0; i < reversed.length(); i++){
            char ch = reversed.charAt(i);
            if (i == 0 && ch == ' '){
                continue;
            } else if (ch == ' '){
                break;
            }
            else {
                num += 1;
            }
        }
    return num;
    }
}
