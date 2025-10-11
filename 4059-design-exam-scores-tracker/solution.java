import java.util.*;

class ExamTracker {
    private List<Integer> times;
    private List<Long> prefixSums;
    public ExamTracker() {
        times = new ArrayList<>();
        prefixSums = new ArrayList<>();
    }
    
    public void record(int time, int score) {
        times.add(time);
        long newSum = (prefixSums.isEmpty()?0:prefixSums.get(prefixSums.size() - 1)) + score;
        prefixSums.add(newSum);
    }
    
    public long totalScore(int startTime, int endTime) {
        int start = lowerBound(times, startTime);
        int end = upperBound(times, endTime) - 1;

        if (start >= times.size() || start > end){
            return 0;
        }
        long total = prefixSums.get(end) - (start == 0?0:prefixSums.get(start - 1));
        return total;
    }

    private int lowerBound(List<Integer> list, int target){
        int left = 0, right = list.size();
        while (left < right){
            int mid = left + (right - left) / 2;
            if (list.get(mid) < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

        private int upperBound(List<Integer> list, int target){
        int left = 0, right = list.size();
        while (left < right){
            int mid = left + (right - left) / 2;
            if (list.get(mid) <= target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}


/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */
