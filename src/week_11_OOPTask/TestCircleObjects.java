package week_11_OOPTask;

public class TestCircleObjects {
    public static void main(String[] args) {


        Circle circle1 = new Circle(5);
        System.out.println(circle1.getRadius());
        circle1.setRadius(8.5);
        circle1.calcArea();
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calculatePerimeter());
        System.out.println(circle1.getRadius()); // getRadius method call through object
        System.out.println("-----------------------------------------------------------");
        System.out.println(Circle.getNumberOfCircle());// static method call from class


        Circle circle2 = new Circle(3.9);
        System.out.println(circle2.getRadius());
        circle2.setRadius(21);
        circle2.setRadius(5);
        System.out.println(circle2.calcArea());
        System.out.println(circle2.calculatePerimeter());
        System.out.println(circle2.getRadius()); // getRadius method call through object
        System.out.println("-----------------------------------------------------------");
        System.out.println(Circle.getNumberOfCircle());// static method call from class




    }
}
