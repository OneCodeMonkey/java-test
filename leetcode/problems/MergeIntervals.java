import java.util.*;

/**
 * Runtime: 5 ms, faster than 94.21% of Java online submissions for Merge Intervals.
 * Memory Usage: 41.7 MB, less than 66.68% of Java online submissions for Merge Intervals.
 */
class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];

        for (int[] interval: intervals) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else {
                result.add(newInterval);
//                print(result);
//                System.out.println();
                newInterval = interval;
            }
        }

        result.add(newInterval);
//        print(result);

        return result.toArray(new int[result.size()][]);
    }

//    private void print(List<int[]> in) {
//        for (int[] arr1: in) {
//            for (int i: arr1) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        int[][] intervals = {
//                {1, 3},
//                {2, 6},
//                {8, 10},
//                {15, 18}
//        };
//
//        MergeIntervals mi = new MergeIntervals();
//        mi.merge(intervals);
//    }
}