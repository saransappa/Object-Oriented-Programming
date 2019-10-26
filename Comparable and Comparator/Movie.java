import java.util.*;
public class Movie implements Comparable <Movie>{
	private double rating;
	private String name;
	private int year;
	
	public Movie(String n,double d,int y) {
		name = n;
		rating = d;
		year = y;
	}
	
	public String toString() {
		return name+" "+rating+" "+year;
	}
	
	public int compareTo(Movie m) {
		if(rating == m.rating) return 0;
		else if(rating > m.rating) return 1;
		else return -1;
	}
	
	public void setRating(double d) {
		rating = d;
	}
	
	public double getRating(){
		return rating;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public String getName() {
		return name;
	}
	
	public void setYear(int y) {
		year = y;
	}
	
	public int getYear() {
		return year;
	}
}
