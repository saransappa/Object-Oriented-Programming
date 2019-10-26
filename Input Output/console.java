import java.util.*;
public class console {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		float b = scan.nextFloat();
		String s = scan.next();
		//System.out.println(scan.hasNext());
		if(scan.hasNext()) {
			System.out.println(scan.hasNext());
			String p= scan.nextLine(); 
			System.out.println(p);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		
		scan.close();
	}
}
