package Starting.Constructor;
class Student3{
    int id;
    String name;
    Student3(int i,String n){
        id = i;
        name = n;
    }
    Student3(Student3 s){
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class CopyConsructor {
    public static void main(String[] args) {
        Student3 s1= new Student3(111,"karan");
        Student3 s2 = new Student3(s1);
        s1.display();
        s2.display();
    }
}
