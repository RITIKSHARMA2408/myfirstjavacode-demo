import java.util.Scanner;

public class self_testque_2 {
    public static void main(String[] args){
        //  2. kisi number ko even ya odd check kro.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter your number: ");
        if(n%2==0){
            System.out.println("Enter number is Even");
        }
        else {
            System.out.println("Enter number is odd");
        }
    }
}
