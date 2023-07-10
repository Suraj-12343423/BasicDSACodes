class Student{
    String name;
    int age;
    Student(){
        System.out.println("Constructor called");
    }
    Student(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println(name+age);

    }
}
public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("aman",24);
        s1.name = "Suraj";
        s1.age = 19;


    }
}
