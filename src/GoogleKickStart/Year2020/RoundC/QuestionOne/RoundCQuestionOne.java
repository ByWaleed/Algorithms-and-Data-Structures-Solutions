package GoogleKickStart.Year2020.RoundC.QuestionOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RoundCQuestionOne {
    private static int solve(int k, int[] arr) {
        if (arr.length < k || arr.length == 0 || k == 0) return 0;

        int answer_count = 0;
        int decreasing_counter = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1] - 1) {
                decreasing_counter++;
            } else {
                decreasing_counter = 0;
            }

            if (arr[i] == 1 && decreasing_counter >= k - 1) {
                answer_count++;
            }
        }

        return answer_count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= t; ++i) {
            int len = in.nextInt();
            int k = in.nextInt();
            int[] heights = new int[len];

            for (int j = 0; j < len; j++) heights[j] = in.nextInt();

            System.out.println("Case #" + i + ": " +  solve(k, heights));
        }
    }
}
