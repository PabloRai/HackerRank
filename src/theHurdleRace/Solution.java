package theHurdleRace;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
		
        for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
			if (height[height_i] > max) {
				max = height[height_i];
			}
		}
        in.close();
        System.out.println( k>max ? 0 : max-k);

    }
}

