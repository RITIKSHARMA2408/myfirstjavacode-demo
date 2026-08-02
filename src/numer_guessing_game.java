import java.util.*;
public class numer_guessing_game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int number=0;
        Random random = new Random();
        int computer = random.nextInt(100)+ 1;
        int attempts =0;
        while (number!=computer) {
            System.out.println("Enter your number: ");
            number = sc.nextInt();
            attempts++;
            if (computer == number) {
                System.out.println("You Win!");
                System.out.println("Attempts: " + attempts);
                break;
            } else {
                if (number > computer) {
                    System.out.println("Too High! Use a Smaller Number");
                } else {
                    System.out.println("Too Low! Use a Larger Number");
                }
            }
        }
    }
}
