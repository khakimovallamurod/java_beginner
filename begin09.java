import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float a, b;
        System.out.print("a = "); a = scanner.nextInt();
        System.out.print("b = "); b = scanner.nextInt();
        float L;
        L = (float)Math.sqrt(a * b);
        System.out.println("L = " + L);
    }
} 