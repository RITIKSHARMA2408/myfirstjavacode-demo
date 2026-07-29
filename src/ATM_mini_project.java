import java.util.Scanner;
public class ATM_mini_project {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3.Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1 :
                System.out.println("Balance = 10,000");
                System.out.println("Enjoy our services!");
                break;
            case 2 :
                System.out.println("Deposit Amount");
                System.out.println(" Enter Deposit Amount:");
                int choice2 = sc.nextInt();
                System.out.println("Amount Deposit Successfully!");
                System.out.println("Stay safe with us!");
                break;
            case 3 :
                System.out.println("Exit");
            default:
                System.out.println("Oops! invalid choice");
        }

    }
}
