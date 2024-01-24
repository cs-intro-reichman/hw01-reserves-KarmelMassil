/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		String t;
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);
		double max = Math.max(a,b);
		double max2 = Math.max(max , c);
		double sum = a + b + c - max2;
		if ( sum > max2) {
			t = "true";
		}
		else t = "false";
		System.out.println(a + ", " + b + ", " + c + ": " + t);
	}
}
