import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        int c = a*b;
        System.out.println(c);

    }
}
