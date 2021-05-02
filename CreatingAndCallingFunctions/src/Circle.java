
public class Circle {
	private double radius;
		public Circle() {
			setRadius(0);
		}
		public Circle(double r){
			setRadius(r);
		}
		public void setRadius(double r) {
			if(r>0)
				radius=r;
		}
		public double getRadius(double r) {
			return radius;
		}
		public double getArea() {
			return (3.14*(radius*radius));
		}
		public double getPerimeter() {
			return (2*(3.14*radius));
		}

}
