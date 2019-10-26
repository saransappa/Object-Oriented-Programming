import java.util.*;
public class Palindrome {
	String s;
	public void makeString() {
		String k ="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				k+=s.charAt(i);
			}
		}
		k=k.toLowerCase();
		s=k;
	}
	
	public boolean isPalindrome(int i) {
		if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
			return false;
		}
		else if(i>=s.length()-i-1) {
			return true;
		}
		else {
			return isPalindrome(i+1);
		}
		
	}
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		String k= scan.nextLine();
		Palindrome p = new Palindrome();
		int i=0;
		p.s = k;
		p.makeString();
		if(p.isPalindrome(i)) {
			System.out.println("'"+k+"'"+ " is a Palindrome");
		}
		else {
			System.out.println("'"+k+"'"+ " is NOT a Palindrome");
		}
		scan.close();
	}
}
