package TestTask;

/**
 * Created by Blazhko Serghii on 10.10.2015.
 */
public class Trapeze implements DoSomethingWithFigures {

    double sideA;
    double sideB;
    double height;

    public Trapeze(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {return  (((sideA + sideB)/2) * height);}

    @Override
    public String getColor() {return "фиолетовый";}

    @Override
    public String draw() {
        return "Фигура: " + getClass().getSimpleName() + ", площадь: " + getArea() + " кв.ед.,"
                + " цвет: " + getColor();
    }
}

