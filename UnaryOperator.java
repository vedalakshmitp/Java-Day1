package operator;

public class UnaryOperator {

	public static void main(String[] args) {
		// Increment
		int X=5;
		int Y=X++;//pre increment
		int Z=++X;//post increment
		System.out.println("X=" +X);
		System.out.println("Y=" +Y);
		System.out.println("Z=" +Z);
		// Decrement
		int M=10;
		int N=M--;//PostDecrement
		int O=--M;//PreDecrement
		System.out.println("M=" +M);
		System.out.println("N=" +N);
		System.out.println("O=" +O);
		}
}



