package TestTask;

/**
 * Created by Blazhko Serghii on 10.10.2015.
 */
public class Square implements DoSomethingWithFigures {

    private double sideA;

    public Square(double sideA) {this.sideA = sideA;}

    @Override
    public double getArea(){return sideA * sideA;}

    public double getSideLength(){return sideA;}

    @Override
    public String getColor(){return "синий";}

    @Override
    public String draw(){return "Фигура: " + getClass().getSimpleName() + ", площадь: " + getArea() + " кв.ед.,"
            + " длина стороны: " + getSideLength() + " ед.," + " цвет: " + getColor();}

}
