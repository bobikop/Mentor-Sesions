package week_13_polymorphism.reallEstate;

public abstract class AbstractHouse {

    private String name;

    public AbstractHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    abstract double area();



}
