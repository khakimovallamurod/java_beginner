import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float a, b;
        System.out.print("a = "); a = scanner.nextInt();
        System.out.print("b = "); b = scanner.nextInt();
        float x, y, z, m;
        x = a + b;
        y = a * b;
        z = (float)Math.pow(a, 2);
        m = (float)Math.pow(b, 2);
        System.out.println("Yig' = " + x);
        System.out.println("Ko'p = " + y);
        System.out.println("Kv1 = " + z);
        System.out.println("Kv2 = " + m);
    }
} 