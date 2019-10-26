
public class Point {
		private int x;
		private int y;
		public Point(int a,int b) {
			this.x=a;
			this.y=b;
		}
		public void setvalue(int a,int b) {
				this.x=a;
				this.y=b;
		}
		public void setPositiveX(int a) throws NegativeCoordinateException {
			if(a>=0) {
				this.x =a;
			}
			else {
				throw new NegativeCoordinateException("The value of X can't be negative!");
			}
		}
		public int getx(){
				return this.x;
		}
		public int gety() {
				return this.y;
		}
		public void print(){
			System.out.println(this.x+","+this.y);
		}
		public  static void compare(Point p,Point q) {
			if(p.x==q.x&&p.y==q.y) {
					System.out.println("yes");
					
			}
			else {
				System.out.println("no");
			}
		}
		public void isorign() {
			if(this.x==0&&this.y==0) {
					System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		public int whichquadrant() {
			if((this.x==0)&&(this.y)==0) {
				return 0;
			}
			else if((this.x)>0&&(this.y>0)) {
				return 1;
			}
			else if((this.x>0)&&(this.y<0)) {
				return 2;
			}
			else if((this.x)<0&&(this.y<0)) {
				return 3;
			}
			else if((this.x>0)&&(this.y<0)) {
				return 4;
			}
			else {
				return -1;
			}
		}
		public int sumx(Point p) {
			int a=p.x+this.x;
			return a;
		}
		public void swap(Point p) {
			Point temp=new Point(this.x,this.y);
			this.x=p.x;
			this.y=p.y;
			p.x=temp.x;
			p.y=temp.y;
		}
		public static int max(Point[] points,int a) {
			int r=0;
			for(int i=0;i<=a;i++) {
				if(points[i].x>points[r].x) {
					r=i;
				}
			}
			return r;
		}
		public static Point[] sort(Point[] points) {
			int n=points.length;
			for(int i=0;i<n;i++) {
				int a=max(points,n-1-i);
				points[n-1-i].swap(points[a]);
			}
			return points;
			
		}
		public static Point[] reverse(Point [] points){
			int n=points.length;
			int i=0;
			int j=n-1;
			while(i<=j){
				points[i].swap(points[j]);
				i++;
				j--;
			} 
			return points;
		}

}
