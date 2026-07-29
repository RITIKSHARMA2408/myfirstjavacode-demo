import java.util.Scanner;

public class Java_self_test {
    public static void main(String[] args){
        // 1. User se 3 number leke average print karo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        int average = a+b+c/3;
        System.out.println("The average of 3 number is: ");
        System.out.println(average);
    }
}
