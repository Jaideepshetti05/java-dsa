import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 9, 12 }
        };

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        for (int[] current : intervals) {
            if (result.isEmpty() ||
                    result.get(result.size() - 1)[1] < current[0]) {
                result.add(current);
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], current[1]);
            }
        }

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}