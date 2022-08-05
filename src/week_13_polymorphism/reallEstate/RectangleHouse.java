package week_13_polymorphism.reallEstate;

public class RectangleHouse extends AbstractHouse {

    int side1, side2;

    public RectangleHouse( int side1, int side2,String name) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double area() {
        return side1*side2;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }
}
