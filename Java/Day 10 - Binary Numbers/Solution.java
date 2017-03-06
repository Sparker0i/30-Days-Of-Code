import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] binary = new int[64];                     //pow(2,6) = 64
        for (int i = 0; i < 64; ++i) {
            binary[i] = 0;
        }
        int temp = n;
        int i = 0;
        while (temp > 0) {
            int r = temp % 2;
            binary[i] = r;
            temp /= 2;
            ++i;
        }
        int max = 0;
        temp = 0;
        for (i = 0; i < 64; ++i) {
            if (binary[i] == 1) {
                temp++;
                if (temp >= max) {
                    max = temp;
                }
            }
            else {
                temp = 0;
            }
        }
        System.out.println(max);
    }
}
