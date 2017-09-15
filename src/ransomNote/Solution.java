package ransomNote;

import java.util.*;
import java.util.Map.Entry;

/*
 * https://www.hackerrank.com/challenges/ctci-ransom-note
 */
public class Solution {
    Map<String, Integer> magazineMap = new HashMap<String, Integer>();
    Map<String, Integer> noteMap = new HashMap<String, Integer>();
    
    public Solution(String magazine, String note) {
        String[] words = magazine.split(" ");
        for(String word : words) {
            if(magazineMap.containsKey(word)) {
               magazineMap.put(word,magazineMap.get(word)+1);
            } else {
                magazineMap.put(word, 0);
            }
        }
        words = note.split(" ");
        for(String word : words) {
            if(noteMap.containsKey(word)) {
            	noteMap.put(word,noteMap.get(word)+1);
            } else {
            	noteMap.put(word, 0);
            }
        }
        
    }
    
    public boolean solve() {
        Iterator<Entry<String, Integer>> it = noteMap.entrySet().iterator();
        Map.Entry<String, Integer> entry;
        if(noteMap.size() > magazineMap.size()) {
        	return false;
        }
        while(it.hasNext()) {
        	entry = it.next();
        	if(!magazineMap.containsKey(entry.getKey()) || magazineMap.get(entry.getKey()) < entry.getValue()) {
        		return false;
        	}
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
