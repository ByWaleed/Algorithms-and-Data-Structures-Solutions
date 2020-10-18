package GoogleKickStart.Year2020.RoundA.QuestionOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class RoundAQuestionOne {
    private static int solve(int budget, int[] prices) {
        if(prices.length == 0) return 0;
        Arrays.sort(prices);
        int n = 0;

        for (int i = 0; i < prices.length; i++) {
            if (budget >= prices[i]) {
                n++;
                budget -= prices[i];
            } else return n;
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= t; ++i) {
            int houses = in.nextInt();
            int budget = in.nextInt();
            int[] prices = new int[houses];

            for (int h = 0; h < houses; h++) prices[h] = in.nextInt();

            System.out.println("Case #" + i + ": " +  solve(budget, prices));
        }
    }
}
