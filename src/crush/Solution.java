package crush;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
/*
 * https://www.hackerrank.com/challenges/crush/problem
 */
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner in = new Scanner(new File("input07.txt"));
        int n = in.nextInt();
        int m = in.nextInt();
        long[] list = new long[n];
        int a;
        int b;
        int k;
        long max = Integer.MIN_VALUE;
        for(int a0 = 0; a0 < m; a0++){
            a = in.nextInt()-1;
            b = in.nextInt()-1;
            k = in.nextInt();

            while(a <= b && b >= 0 && a < n) {
            	list[a] += k;
            	if(a != b) {
                    list[b] += k;
                }
            	if(list[a] > max) {
	              	max = list[a];
	          	}
            	if(list[b] > max) {
	              	max = list[b];
	          	}
            	a++;
            	b--;
            }
        }
        in.close();
        System.out.println(max);
    }
}