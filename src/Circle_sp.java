 import java.util.Scanner;
    public class Circle_sp {
    static double areaCircle(int r){
        return Math.PI*r*r;
    }
    public static void main(String[] args){
     // 8. Method bana kar circle ka area calculate karo.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
     double area = areaCircle(r);
        System.out.println(area);
    }
}
