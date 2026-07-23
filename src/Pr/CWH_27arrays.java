package Pr;

public class CWH_27arrays {
    public static void main(String[] args) {
        int[] marks = {98, 91, 80, 81, 74};
        System.out.println(marks.length);
        System.out.println("Printing by native method");
        System.out.println(marks[0]);
        //Displaying an array (for loop)
        System.out.println("Printing array by for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            // For each loop in java for array
            System.out.println("Printing using for each loop");
            for (int element : marks) {
                System.out.println(element);

            }
        }
    }
}