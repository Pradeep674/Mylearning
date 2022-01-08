public class MethodsConstructor {
	private double radius;
	private int length;
	private int height;
	private int sides;

	MethodsConstructor() {
		System.out.println("No- arg constructor");
	}

	MethodsConstructor(double d) {
		this.radius = d;
		System.out.println("Circle Constructor");

	}

	MethodsConstructor(int Length, int Height) {
		this.length = Length;
		this.height = Height;
		System.out.println("Rectangle Constructor");
	}

	MethodsConstructor(int Sides) {
		this.sides = Sides;
		System.out.println("Square Constructor");
	}

	public double circle() {
		double area =  2 * 3.14 * radius *radius;
		return area;
	}

	public int rectangle() {
		int area = length * height;
		return area;
	}

	public int square() {
		int area = sides ^ 2;
		return area;
	}
	public int rhombus(int d1, int d2) {
		int area=(d1* d1 * d2 *d2 )/2;
		return area;
	}
	
	public float triangle(int b, int h ) {
		float area= (float)(b*h)/2;
		return area;
	}

	public static void main(String[] args) {
		MethodsConstructor c= new MethodsConstructor(5.5);
		System.out.println(c.circle());

		MethodsConstructor r= new MethodsConstructor(9, 5);
		System.out.println(r.rectangle());
		
		MethodsConstructor s= new MethodsConstructor(7);
		System.out.println(s.square());
		
		MethodsConstructor rhom= new MethodsConstructor();
		System.out.println(rhom.rhombus(4,5));
		
		MethodsConstructor triangle= new MethodsConstructor();
		System.out.println(triangle.triangle(10,5));
		
	}


}
