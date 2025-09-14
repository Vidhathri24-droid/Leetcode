class Solution {
    public int earliestTime(int[][] tasks) {
        int[] time = new int[tasks.length];
        for(int i=0; i < tasks.length; i++){
            int temp = 0;
            for (int j = 0; j < tasks[i].length; j++){
                temp+= tasks[i][j];
            }
            time[i] = temp;
        }
        Arrays.sort(time);
        return time[0];
    }
}
