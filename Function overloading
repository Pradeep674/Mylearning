public class FunctionOverload1 {
	int pi = (int) 3.14f;

	public int calculate(int a, int b) {
		int add = a + b;
		return add;
	}

	public int calculate(int a) {
		int areaCircle = 2 * pi * (a ^ 2);
		return areaCircle;
	}

	public int calculate(float e, float f) {
		int rectangleArea = (int) (e * f);
		return rectangleArea;
	}

	public static void main(String[] args) {
		FunctionOverload1 fo = new FunctionOverload1();

		System.out.println(fo.calculate(10, 20));
		System.out.println(fo.calculate(5));
		System.out.println(fo.calculate(5f, 6f));
	}
}
