import java.util.Scanner;

public class uppercase_sp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fullname = sc.nextLine();
        System.out.println(fullname.toUpperCase());
    }
}
