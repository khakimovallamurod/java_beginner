import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, s; 
		System.out.print("a = ");
		a = scanner.nextInt();
	    s = (int) Math.pow(a,2);
	    System.out.println("s = " + s);
	}
}