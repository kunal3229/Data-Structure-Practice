package Starting.Constructor;

class Student{
    int id;
    String name;
    Student(int i,String n){
        id =i;
        name = n;
    }
    void display(){
        System.out.println(id + " " + name);
    }
}
public class ParameterizedConstructor { // it is used to provide different values to different objects
    public static void main(String[] args) {
        Student s1 = new Student(111,"karan");
        Student s2 = new Student(222,"rahul");
        s1.display();
        s2.display();
    }
}
