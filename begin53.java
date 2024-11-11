import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, r;
        System.out.print("a = "); a = scanner.nextInt();
        r = (int)a/100;
        a = (int)a%100;
        a = a*10 + r;
        System.out.println("new_a = " + a);
    }
} 