import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float d, L, pi; 
		System.out.print("d = "); 
		d = scanner.nextInt();
		pi = (float) Math.PI;
	    L = pi * d;
	    System.out.println("L = " + L);
	}
}