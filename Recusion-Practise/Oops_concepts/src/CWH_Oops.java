public class CWH_Oops {
    //CWH - Code with Harry
    class student{
        String name;
        int age;
        public void printInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }

    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ritik";
        s1.age = 18;
        Student s2 = new Student();
        s2.name = "Divyansh";
        s2.age = 20;
        s2.printInfo();
        s1.printInfo();
    }
}
