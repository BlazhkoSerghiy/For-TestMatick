package TestTask;

/**
 * Created by Blazhko Serghii on 10.10.2015.
 */
public class Circle implements DoSomethingWithFigures{

    private double diameter;

    public Circle(double diameter) {this.diameter = diameter;}

    public double getRadius(){return diameter/2;}

    @Override
    public double getArea() {return 3.14 * (getRadius()*2);}

    @Override
    public String getColor() {return "зеленый";}

    @Override
    public String draw() {
        return "Фигура: " + getClass().getSimpleName() + ", площадь: " + getArea() + " кв.ед.," +
                " радиус: " + getRadius() + " цвет: " + getColor();
    }
}
