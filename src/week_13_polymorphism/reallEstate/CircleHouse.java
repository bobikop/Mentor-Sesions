package week_13_polymorphism.reallEstate;

public class CircleHouse extends  AbstractHouse{

    int radius;
    static double pi;

    static{
        pi=3.14;
    }

    public CircleHouse(int radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    double area() {
        return radius*radius*pi;
    }
}
