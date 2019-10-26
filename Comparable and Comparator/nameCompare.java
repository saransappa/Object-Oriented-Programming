import java.util.*;
public class nameCompare implements Comparator <Movie>{
	public int compare (Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
	}
}
