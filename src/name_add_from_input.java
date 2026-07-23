import java.util.Scanner;
public class name_add_from_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your  first name: ");
        String firstname = sc.nextLine();
        System.out.println("Enter your last name: ");
        String lastname = sc.nextLine();
        System.out.println(firstname+lastname);
        // find length of name
        System.out.println(firstname.length());
        // check name equal or not
        System.out.println(firstname.equals("kartik"));

    }
}
