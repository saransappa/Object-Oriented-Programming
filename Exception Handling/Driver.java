
public class Driver {
	public static void main(String [] args) {
		Point p = new Point(5,6);
		try {
			p.setPositiveX(-10);
		}
		catch(NegativeCoordinateException nce){
			System.out.println(nce.getMessage());
	        nce.printStackTrace();
			System.out.println(p.getx());
		}
		try {
			p.setPositiveX(-10);
		}
		finally {
			System.out.println("Entered finally block");
		}
	}
}
