public class Oops_Polymorphism {
    // ek function jb bahaut saare kam krta h use polymorphism khte h. jaise isme printInfo ek function h jo bahaut saare kam akela krega.
   static class Student {
        String name;
        int age;

        public void printInfo(String name) {
            System.out.println(name);
        }

        public void printInfo(int age) {
            System.out.println(age);
        }

        public void printInfo(String name, int age) { // Agar yha se int age htade to commpile time error a jayega ye java detect kr leta hi ki return type or parameter same h ek function k upar bhi.
            System.out.println(name + " " + age);
        }
        // runtime error tb ayenge jb us code ko hm run krenge.
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        s1.printInfo(s1.name,s1.age);
    }

}
