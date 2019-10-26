import java.util.*;
public class Driver {
	public static void main(String [] args) {
		ArrayList <Movie> l = new ArrayList <Movie>();
		l.add(new Movie("Saaho",2.9,2019));
		l.add(new Movie("Bahubali 2",3.0,2018));
		l.add(new Movie("Bahubali 1",2.8,2016));
		
		Collections.sort(l,Collections.reverseOrder());
		
		for(Movie m: l) {
			System.out.println(m);
		}
	}
}
