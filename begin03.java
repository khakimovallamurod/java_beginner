import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a,b, P, S; 
		System.out.print("a = "); a = scanner.nextInt();
		System.out.print("b = "); b = scanner.nextInt();
		P = 2*(a + b);
	    S = a * b;
	    System.out.println("P = " + P);
	    System.out.println("S = " + S);
	}
}