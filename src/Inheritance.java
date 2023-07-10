class Shape{
    public void show(){
        System.out.println("Hello");
    }
}
class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println((0.5) * l * h);
    }
}
class Equilateraltrainagle extends Triangle{
    public void area(int l , int h) {
        System.out.println(0.5 * l * h);
    }
}
class Circle extends Shape{
        public void area(int r){
            System.out.println((3.14) * r * r);
        }
}
public class Inheritance {
    public static void main(String[] args) {
        Shape S = new Shape();
        S.show();
        Triangle T = new Triangle();
        T.area(2,4);
        Equilateraltrainagle E = new Equilateraltrainagle();
        E.area(4,4);
        Circle C = new Circle();
        C.area(5);
    }
}
