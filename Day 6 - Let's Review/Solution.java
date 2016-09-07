import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String[] S = new String[T];
        for (int i = 0; i < T; ++i)
            S[i] = scan.next();
        for (int i = 0; i < T; ++i) {
            for (int j = 0; j < S[i].length() ; ++j) {
                if (j % 2 == 0)
                    System.out.print(S[i].charAt(j));
            }
            System.out.print(" ");
            for (int j = 0; j < S[i].length() ; ++j) {
                if (j % 2 != 0)
                    System.out.print(S[i].charAt(j));
            }
            System.out.println();
        }
    }
}
