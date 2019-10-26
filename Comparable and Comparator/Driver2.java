import java.util.*;
public class Driver2 {
	public static void main(String [] args) {
		ArrayList <Movie> l = new ArrayList <Movie>();
		l.add(new Movie("Saaho",2.9,2019));
		l.add(new Movie("Bahubali 2",3.0,2018));
		l.add(new Movie("Bahubali 1",2.8,2016));
		ratingCompare r1 = new ratingCompare();
		Collections.sort(l,r1);
		
		for(Movie m: l) {
			System.out.println(m);
		}
		
		nameCompare n1 = new nameCompare();
		Collections.sort(l,n1);
		
		for(Movie m: l) {
			System.out.println(m);
		}
	}
}
