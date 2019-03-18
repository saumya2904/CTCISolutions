package StringsArrays;

public class Problem_1 {
	public static boolean uniqueChars(String s)
	{  boolean d = true;
		for (int i =0; i<s.length();i++) {
			for (int j=0;j<s.length();j++) {
				if (j==i) {
				continue;	
				}
				else if(s.charAt(i)==s.charAt(j)) {
						d = false;				
				}
				
			}
		}
		return d;
		
	}
	public static void main(String args[])
	{
		String m ="dfgdfghb";
		boolean n;
		n = uniqueChars(m);
		System.out.println(n);
		
		
		
	}
}
