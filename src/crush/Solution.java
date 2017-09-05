package crush;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
/*
 * https://www.hackerrank.com/challenges/crush/problem
 */
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] list = new long[n];
        int a;
        int b;
        int k;
        long max = Integer.MIN_VALUE;
        for(int a0 = 0; a0 < m; a0++){
            a = in.nextInt()-1;
            b = in.nextInt();
            k = in.nextInt();
            list[a] += k;
            if(b < n) {
            	list[b] -= k;
            }

        }
        in.close();
        long tmp = 0;
        for (int i = 0; i < list.length; i++) {
			tmp += list[i];
			if(tmp > max) {
				max = tmp;
			}
		}
        System.out.println(max);
    }
}