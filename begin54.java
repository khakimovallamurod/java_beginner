import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float a;
        System.out.print("a = "); a = scanner.nextInt();
        r = a%10;
        a = (int)a/100;
        a = r*100 + a;
        System.out.println("new_a = " + a);
    }
} 