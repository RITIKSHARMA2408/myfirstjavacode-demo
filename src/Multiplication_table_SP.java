import java.util.Scanner;

public class Multiplication_table_SP {
    public static void main(String[] args){
     // 7. multiplication tabale print karo.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        for (i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
