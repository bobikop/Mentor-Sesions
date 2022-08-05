package week_13_polymorphism.reallEstate;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeTest {
    public static void main(String[] args) {

        //       System.out.println("square : " + isAreaEnough(new Square(20), 300));
        //        System.out.println("circle : " + isAreaEnough(new Circle(20), 300));


        ArrayList<AbstractHouse> houses = new ArrayList<>(Arrays.asList(
                new SquareHouse(20, "Square-1"),
                new SquareHouse(25, "Square-2"),
                new SquareHouse(30, "Square-3"),

                new RectangleHouse(30, 20, "Rectangle-1"),
                new RectangleHouse(20, 25, "Rectangle-2"),

                new CircleHouse(15, "Circle-1"),
                new CircleHouse(20, "Circle-2"),
                new CircleHouse(10, "Circle-3")));

        System.out.println(filterProperties(houses, 600));
    }

    public static ArrayList<String> filterProperties (ArrayList<AbstractHouse> houses, int minArea){

        ArrayList<String> result = new ArrayList<>();
        for (AbstractHouse house : houses){
            if (isAreaEnough(house, minArea)){
                result.add(house.getName());
            }
        }
        return result;
    }

    public static boolean isAreaEnough(AbstractHouse house, int minArea){
        //System.out.println(house.getArea());
        return house.area() >= minArea;
    }

}
