class pen{
    String color;
    String type;// ballpoint; gel

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
 class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
 }
public class oops {
    public static void main(String [] args){
      pen pen1= new pen();
        pen1.color = "blue";
        pen1.type = "gel";

       pen pen2 = new pen();
       pen2.color = "black";
       pen2.type = "ballpoint";

       pen1.printColor();
       pen2.printColor();

      Student s1 = new Student();
      s1.name = "Ritik";
      s1.age = 18;

        s1.printInfo();
    }
}
