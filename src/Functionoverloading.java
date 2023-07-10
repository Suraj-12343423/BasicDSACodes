class Student2{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name , int age){
        System.out.println(name +" "+ age);
    }
}
public class Functionoverloading {
    public static void main(String[] args) {
        Student2 s0 = new Student2();
        s0.printinfo("Suraj");
        s0.printinfo(17);
        s0.printinfo("Rahul",25);
    }
}
