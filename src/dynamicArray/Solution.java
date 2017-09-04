package dynamicArray;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/dynamic-array/problem
 */

public class Solution {
	private static ArrayList<ArrayList<Integer>> seqs = new ArrayList<ArrayList<Integer>>();
	
    public static void main(String[] args) {
    	int sequences;
    	int queries;
    	int lastAnswer = 0;
    	int type;
    	int x;
    	int y;
    	int size;
    	Scanner sc = new Scanner(System.in);
    	sequences = sc.nextInt();
    	queries = sc.nextInt();
    	for (int i = 0; i < sequences; i++) {
    		seqs.add(new ArrayList<Integer>());
		}
    	for (int i = 0; i < queries; i++) {
			type = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
    		if(type == 1) {
				seqs.get((x ^ lastAnswer) % sequences).add(y);
			} else {
				size = seqs.get((x ^ lastAnswer) % sequences).size();
				lastAnswer = seqs.get((x ^ lastAnswer) % sequences).get(y % size);
				System.out.println(lastAnswer);
			}
		}
    	
    	
    	sc.close();
    }
}