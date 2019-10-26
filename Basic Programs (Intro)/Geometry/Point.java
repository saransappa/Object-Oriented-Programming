
public class Point {
	private int x;
	private int y;
	public Point(int a,int b) {
		x=a;
		y=b;
	}
	public Point() {
		this.x=0;
		this.y=0;
	}
	public void setX(int a){
		this.x=a;
	}
	public void setY(int b){
		this.y=b;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	public boolean isOrigin(){
		if(x==0 && y==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public String whichQuadrant() {
		String s;
		if(x>0 && y>0) {
			s="Q1";
		}
		else if(x<0 && y>0) {
			s="Q2";
		}
		else if(x<0 && y<0) {
			s="Q3";			
		}
		else if(x>0 && y<0) {
			s="Q4";
		}
		else if(y==0 && x>0) {
			s="X-axis";
		}
		else if(x==0 && y>0) {
			s="Y-axis";
		}
		else {
			s="Origin";
		}
		return s;
	}
	public Point xProjection() {
		Point z=new Point();
		z.setX(this.x);
		z.setY(0);
		return z;
	}
	public Point yProjection() {
		Point z=new Point();
		z.setX(0);
		z.setY(this.y);
		return z;
	}
	public Point sumOfPoints(Point b) {
		Point u=new Point(x+b.x,y+b.y);
		return u;
	}
	public int slope(Point b) {
		return (b.y-this.y)/(b.x-this.x);
	}
}
