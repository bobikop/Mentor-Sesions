package week_13_polymorphism.reallEstate;

public class SquareHouse extends AbstractHouse{

    int side;

    public SquareHouse( int side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    double area() {
        return side*side;
    }
}
