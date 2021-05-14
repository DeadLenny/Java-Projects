
public class RightTriangle {
	private double base;
	private double height;
	private double hypotenuse;
	private int xLoc;
	private int yLoc;
	private int ID;
	private static double ScaleFactor;
		public RightTriangle() {
			setBase(0);
			setHeight(0);
			setScaleFactor(1);
			setxLoc(0);
			setyLoc(0);
			setID(0);
		}
		public RightTriangle(double b, double h,double s, int x, int y,int i) {
			setBase(b);
			setHeight(h);
			setScaleFactor(s);
			setxLoc(x);
			setyLoc(y);
			setID(i);
			
		}
		public void setBase(double b) {
			if(b>0)
				base=b;
		}
		public void setHeight(double h) {
			if(h>0)
				height=h;
		}
		public void setxLoc(int x) {
			if(x>0)
			xLoc= x;
		}
		public void setyLoc(int y) {
			if(y>0)
			yLoc= y;
		}
		public void setID(int i) {
			if(i>0)
			ID= i;
		}
		public static void setScaleFactor(double s) {
			if(s>0)
				ScaleFactor=s;
		}
		
		public double getBase() {
			return base;
		}
		public double getHeight() {
			return height;
		}
		public int getxLoc() {
			return xLoc;
		}
		public int getyLoc() {
			return yLoc;
		}
		public int getID() {
			return ID;
		}
		public static double getScaleFactor() {
			return ScaleFactor;
		}
		public double getHypotenuse() {
			double a=((base*base)+(height*height));
			hypotenuse=Math.sqrt(a);
			return hypotenuse;
		}
		public double getArea() {
			return ((base*height)/2);
		}
		public double getPerimeter() {
			double a=((base*base)+(height*height));
			return base+height+( Math.sqrt(a));
			
		}
		public void ScaleShape() {
			double b= base*ScaleFactor;
			setBase(b);
			double h= height*ScaleFactor;
			setHeight(h);
			getHypotenuse();
			
		}
}
