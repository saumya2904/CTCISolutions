package StringsArrays;

public class Problem_2Sol2 {
static boolean permutation(String s, String t) {
	if(s.length()!=t.length())
		return false;
	int[] letters = new int[128];
	for (int i =0;i<s.length();i++) {
		letters[s.charAt(i)]++;
	}
	for (int i=0;i<t.length();i++) {
		letters[t.charAt(i)]--;
		if(letters[t.charAt(i)]<0) {
			return false;
		}
	}
	return true;
}

 public static void main(String args[])
{
	String m ="saumya";
	String n = "samuya";
	boolean k;
	k = permutation(m, n);
	System.out.println(k);
		
}
}
