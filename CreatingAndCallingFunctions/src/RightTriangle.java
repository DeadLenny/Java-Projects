
public class RightTriangle {
	private double length;
	private double width;
	private double hypotenuse;
		public RightTriangle() {
			setLength(0);
			setWidth(0);
		
		}
		public RightTriangle(double l, double w) {
			setLength(l);
			setWidth(w);
			
		}
		public void setLength(double l) {
			if(l>0)
				length=l;
		}
		public void setWidth(double w) {
			if(w>0)
				width=w;
		}
		
		public double getLength() {
			return length;
		}
		public double getWidth() {
			return width;
		}
		public double getHypotenuse() {
			double a=((length*length)+(width*width));
			hypotenuse=Math.sqrt(a);
			return hypotenuse;
		}
		public double getArea() {
			return ((length*width)/2);
		}
		public double getPerimeter() {
			double a=((length*length)+(width*width));
			return length+width+( Math.sqrt(a));
			
		}
}
