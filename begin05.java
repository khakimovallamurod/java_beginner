import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a, V, S; 
		System.out.print("a = "); 
		a = scanner.nextInt();
		V = (float) Math.pow(a, 3);
		S = 6 * (float)Math.pow(a, 2);
	    System.out.println("V = " + V);
	    System.out.println("S = " + S);
	}
}