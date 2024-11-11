import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a, b, c;
		System.out.print("a = "); a = scanner.nextInt();
		System.out.print("b = "); b = scanner.nextInt();
		System.out.print("c = "); c = scanner.nextInt();
        float V, S;
		V = a * b * c;
		S = 2*(a*b + b*c + c*a);
	    System.out.println("V = " + V);
	    System.out.println("S = " + S);
	}
}