package StringsArrays;

import java.util.HashMap;
import java.util.Map;

public class Problem_2 {
	public static boolean permutation(String s, String n)
	{
	String s1 = s;
	String s2 = n;

	Map<Character, Integer> stringHash = new HashMap<Character, Integer>();
	for (char ch : s1.toCharArray())
	    stringHash.put(ch, stringHash.containsKey(ch) ? (stringHash.get(ch) + 1) : 1);
	System.out.println(stringHash);
	Map<Character, Integer> stringHash1 = new HashMap<Character, Integer>();
	for (char ch : s2.toCharArray())
	    stringHash1.put(ch, stringHash1.containsKey(ch) ? (stringHash1.get(ch) + 1) : 1);
	System.out.println(stringHash1);
	System.out.println(stringHash.equals(stringHash1));
	return true;
}
	
	public static void main(String args[])
	{
		String m ="saumya";
		String n = "samuya";
		boolean k;
		k = permutation(m, n);
		
		
		
	}
}

