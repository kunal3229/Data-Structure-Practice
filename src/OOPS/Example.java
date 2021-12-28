package OOPS;
class Pen{
    String color;
    String type; // ballpoint or gel

    public void write(){
        System.out.println("Writing something");
    }
    public void printcolor(){
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
public class Example {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.color = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printcolor();
        pen2.printcolor();

        Student s1 = new Student();
        s1.name = "kunal";
        s1.age = 14;
         s1.printInfo();
    }
}
