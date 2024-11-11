import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float r;
        System.out.print("R = "); r = scanner.nextInt();
        float L, S, pi;
        pi = (float)Math.PI;
        L = pi * 2 * r;
        S =  pi * (float)Math.pow(r, 2);
        System.out.println("L = " + L);
        System.out.println("S = " + S);
    }
} 