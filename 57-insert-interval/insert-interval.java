class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;

        int[][] newIntervals = new int[n + 1][2];

        for(int i = 0; i < n; i++) {
            newIntervals[i] = intervals[i];
        }

        newIntervals[n] = newInterval;

        int len = newIntervals.length;

        int[][] res = new int[len][2];

        int e = 0;

        Arrays.sort(newIntervals, (a, b)-> Integer.compare(a[0], b[0]));
        
        res[0] = newIntervals[0];

        for(int i = 1; i < len; i++) {
            if(newIntervals[i][0] <= res[e][1]) {
                res[e][1] = Math.max(res[e][1], newIntervals[i][1]);
            }
            else {
                e++;
                res[e] = newIntervals[i];
            }
        }
        return Arrays.copyOfRange(res, 0, e + 1);
    }
}