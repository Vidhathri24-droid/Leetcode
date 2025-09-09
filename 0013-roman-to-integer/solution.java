class Solution {
    public int romanToInt(String s) {
        int num = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            char d = ' ';
            if (i != 0){
                d = s.charAt(i-1);
            }
            if (c == 'L'){
                if (d == 'X'){
                    num += 40;
                    i -= 1;
                } else{
                    num += 50;
                }
            } else if (c == 'X'){
                if (d == 'I'){
                    num += 9;
                    i -= 1;
                }else{
                    num += 10;
                }
            } else if (c == 'V'){
                if (d == 'I'){
                    num += 4;
                    i -= 1;
                } else {
                    num += 5;
                }
            } else if (c == 'C'){
                if (d == 'X'){
                    num += 90;
                    i -= 1;
                } else{
                    num += 100;
                }
            } else if (c == 'D'){
                if (d == 'C'){
                    num += 400;
                    i -= 1;
                } else{
                    num += 500;
                }
            } else if (c == 'M'){
                if (d == 'C'){
                    num += 900;
                    i -= 1;
                }else{
                    num += 1000;
                }
            } else{
                num += 1;
            }
        }
        return num;
    }
}
