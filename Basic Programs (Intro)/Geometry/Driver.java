
public class Driver {
	public static void main(String[] args) {
		Point p=new Point();
		p.setX(10);
		p.setY(20);
		System.out.println("X-coordinate is "+p.getX()+" and the Y-coordinate is "+p.getY());
		p.print();
		System.out.println(p);
		Point k=new Point(4,5);
		k.print();
		Point q=new Point();
		boolean s=q.isOrigin();
		System.out.println(s);
		String a=k.whichQuadrant();
		System.out.println(a);
		Point l=new Point();
		l=p.xProjection();
		l.print();
		Point m=new Point();
		m=k.yProjection();
		m.print();
		Point aa=new Point(9,9);
		Point ab=new Point(10,10);
		Point j=new Point();
		j=aa.sumOfPoints(ab);
		j.print();	
		int slope=aa.slope(ab);
		System.out.println(slope);
				
				
		
	}
	
}
