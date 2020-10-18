package GoogleKickStart.Year2020.RoundB.QuestionOne;

import java.util.*;
import java.io.*;

public class RoundBQuestionOne {
    private static int solve(int[] heights) {
        if (heights.length < 3) return 0;
        int peaks = 0;

        for (int i = 1; i < heights.length - 1; i++) {
            if ((heights[i] > heights[i-1]) && (heights[i] > heights[i+1])) peaks++;
        }

        return peaks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= t; ++i) {
            int checkpoints = in.nextInt();
            int[] heights = new int[checkpoints];

            for (int j = 0; j < checkpoints; j++) heights[j] = in.nextInt();

            System.out.println("Case #" + i + ": " +  solve(heights));
        }
    }
}
