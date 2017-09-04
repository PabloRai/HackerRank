package sparseArrays;
import java.util.Scanner;

public class Solution {
/*
 * https://www.hackerrank.com/challenges/sparse-arrays/problem
 */
    public static void main(String[] args) {
        int[] counter;
        String[] strings;
        String[] queries;
        Scanner sc = new Scanner(System.in);
        strings = new String[sc.nextInt()];
        for (int i = 0; i < strings.length; i++) {
			strings[i] = sc.next();
		}
        queries = new String[sc.nextInt()];
        counter = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
			queries[i] = sc.next();
		}
        for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < strings.length; j++) {
				if(strings[j].equals(queries[i])) {
					counter[i]++;
				}
			}
		}
        for (int i = 0; i < counter.length; i++) {
			System.out.println(counter[i]);
		}
        sc.close();
    }
}
