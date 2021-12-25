package Starting.Constructor;
class Student2{
    int id;
    String name;
    int age;
    Student2(int i, String n){
        id = i;
        name = n;
    }
    Student2(int i, String n, int a){
     id = i;
     name = n;
     age = a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
    }
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student2 s1 = new Student2(111,"karan");
        Student2 s2 = new Student2(222,"rahul",22);
        s1.display();
        s2.display();
    }
}
