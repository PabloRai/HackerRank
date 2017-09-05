package makingAnagrams;

import java.util.Scanner;

public class Solution {
    public static int numberNeeded(String first, String second) {
      int counter = 0;
      if(first.equals(second)) {
          return 0;
      } else {
           if(first.length() <= second.length()) {
               counter = count(first, second);
           } else {
        	   counter = count(second, first);
           }
      }
      return counter;
    }

	private static int count(String first, String second) {
		int i = 0;
		while(first.length() > i) {
			if(second.contains(Character.toString(first.charAt(i)))) {
				second = second.replaceFirst(Character.toString(first.charAt(i)), "");
				first = first.replaceFirst(Character.toString(first.charAt(i)), " ");
			}
			i++;
		}

		
		return first.replaceAll(" ", "").length()+second.length();
	}
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        System.out.println(numberNeeded(a, b));
    }
}