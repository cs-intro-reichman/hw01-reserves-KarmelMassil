/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int random = (int)(Math.random() * (b - a) + a);
		int ran = (int)(Math.random() * (b - a)) + a;
		int dom = (int)(Math.random() * (b - a)) + a;
		int min = Math.min(ran, dom);
		int min2 = Math.min(min, random);
		System.out.println(random);
		System.out.println(ran);
		System.out.println(dom);
		System.out.println("The minimal generated number was " + min2);
	}
}
