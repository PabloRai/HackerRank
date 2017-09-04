package arrayLeftRotation;

import java.util.Scanner;

public class Solution {

    static int[] leftRotation(int[] a, int d) {
        int[] res = new int[a.length];
        int index = 0;
        for(int i = d; i < a.length; i++) {
            res[index] = a[i];
            index++;
        }
        
        for(int i = 0; i < d; i++) {
            res[index] = a[i];
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}