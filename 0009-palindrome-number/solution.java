class Solution {
    public static boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;
        if (x<0){
            return false;
        } else {
            while (num != 0){
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            return (rev == x);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean palindrome = isPalindrome(x);
        if (palindrome) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
