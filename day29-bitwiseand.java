import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {
 public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            System.out.println(solve(N, K));
        }

        sc.close();
    }

    static int solve(int N, int K) {
        int result = 0;
        for (int A = 1; A <= N; A++) {
            for (int B = A + 1; B <= N; B++) {
                int current = A & B;
                if (current > result && current < K) {
                    result = current;
                }
            }
        }
        return result;
    }
}
