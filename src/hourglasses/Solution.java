package hourglasses;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/2d-array/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        in.close();
        for(int k = 0; k < 4; k++) {
           for(int offset = 0; offset < 4; offset++) { 
	        	for(int i = 0; i < 3; i++) {
	                for(int j = 0; j < 3; j++) {
	                   if((i!=1 && j!=0) || (i!=1 && j!=2) || (i == 1 && j == 1)) {
	                       sum += arr[i+offset][j+k];
	                   } 
	                }
	            }
	            if(sum > max) {
	                max = sum;
	            }
	            sum = 0;
           }

        }

        System.out.println(max);
        
    }
}
