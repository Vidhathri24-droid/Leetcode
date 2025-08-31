import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        int k = 0;
        for (int number: order){
            for (int j: friends){
                if (number == j){
                    arr[k] = number;
                    k++;
                }
            }
        }
        return arr;
    }
}
