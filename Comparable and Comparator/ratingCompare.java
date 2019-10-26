import java.util.*;
public class ratingCompare implements Comparator <Movie> {
	public int compare(Movie m1,Movie m2) {
		if(m1.getRating() == m2.getRating()) return 0;
		else if(m1.getRating() > m2.getRating()) return 1;
		else return -1;
	}
}
