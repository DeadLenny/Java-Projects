

	abstract  class shapes{
		protected static double ScaleFactor=1.0;
		private int xLoc=0;
		private int yLoc=0;
		private int ID=0;
		
		public shapes( int x, int y,int i,double s) {
			
			setScaleFactor(s);
			setxLoc(x);
			setyLoc(y);
			setID(i);
			
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
	}
	class rightTriangle extends shapes{
		
		public rightTriangle(int x, int y, int i, double s, double b, double h) {
			super(x, y, i, s);
			setBase(b);
			setHeight(h);
			getBase();
			getHeight();
			getHypotenuse();
			getArea();
			getPerimeter();
			ScaleShape();
		}
		private double base=0;
		private double height=0;
		private double hypotenuse=0;
		
		public void setBase(double b) {
			if(b>0)
				base=b;
		}
		public void setHeight(double h) {
			if(h>0)
				height=h;
		}
		public double getBase() {
			return base;
		}
		public double getHeight() {
			return height;
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
	class circle extends shapes{

		public circle(int x, int y, int i, double s, double r) {
			super(x, y, i, s);
			setRadius(r);
			getRadius();
			getArea();
			getPerimeter();
			ScaleShape();
		}
		private double radius;
		public double getRadius(){
			return radius;
		}
		public void setRadius(double r){
			if (r > 0.0){
				radius = r;
			}
		}

		
		public double getPerimeter(){
			return 2 * Math.PI * radius;
		}

		// GetArea method
		public double getArea(){
			return Math.PI * radius * radius;
		}

		// ScaleShape method
		public void ScaleShape(){
			double r = radius * ScaleFactor;
			setRadius(r);
		}
		
	}
	class rectangle extends shapes{

		public rectangle(int x, int y, int i, double s,double l, double w) {
			super(x, y, i, s);
			setLength(l);
			setWidth(w);
			getArea();
			getPerimeter();
			getLength();
			getWidth();
			ScaleShape();
			// TODO Auto-generated constructor stub
		}
		private double length;
		private double width;
		public double getLength(){
			return length;
		}
		public void setLength(double l){
			if (l > 0.0){
				length = l;
			}
		}
		public double getWidth(){
			return width;
		}
		public void setWidth(double w){
			if (w > 0.0){
				width = w;
			}
		}

	
		public double getPerimeter(){
			return (2 * width + 2 * length);
		}

		// GetArea method
		public double getArea(){
			return width * length;
		}

		// ScaleShape method
		public void ScaleShape(){
			double w = width * ScaleFactor;
			setWidth(w);
			double l = length * ScaleFactor;
			setLength(l);
		}
		
	}

