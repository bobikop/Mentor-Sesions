package week_11_OOPTask;

public class Circle {

    //define two fields radius(necessary for all calculations)
    private double radius;
    //and numberOfCircle(keep the info of how many object was created from this class).
    private static int numberOfCircle;

    public static double pi;

    //create default and parameterized constructors
    //default constructor should increase the number of object when a new object created
    public Circle(){
        numberOfCircle++;
    }

    //parameterized constructor should increase the number of object when a new object created.
    //and not allowed to initialize object with the radius value lower than Zero.

    public Circle(double radius) {
        setRadius(radius);
    }

    //create getter and setter methods for radius.
    //getter
    public double getRadius() {
        return radius;
    }

    //setter if the value of radius is lower than zero keep the previous value.
    public void setRadius(double radius) {//we defined the constraints and make a detailed contract with user.
        if (radius < 0) {
            System.out.println("Invalid radius input! Radius can not be negative number!");
            System.exit(1);
        }
        this.radius = radius;
    }

    //do not allow any object to change value of static variable just get the current
    //value of numberOfCircle. We did not allow to the user changing the value of this static field.
    //it can just be changed while creating objects.
    public static int getNumberOfCircle() {
        return numberOfCircle;
    }

    //calculate area of Circle
    public double calcArea() {
        return (this.radius*this.radius*pi);
    }

    //calculate perimeter of Circle
    public double calculatePerimeter() {
        return radius*2*pi;
    }


}





