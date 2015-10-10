package TestTask;

/**
 * Created by Blazhko Serghii on 10.10.2015.
 */
public class Triangle implements DoSomethingWithFigures {

    double sideA;
    double sideB;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float getHypotenuse(){
        double h = Math.sqrt((sideA * 2) + (sideB * 2));
        return (float)(h * 2) ;
    }

    @Override
    public double getArea(){return  0.5 * sideA * sideB;}

    @Override
    public String getColor() {return "желтый";}

    @Override
    public String draw() {
        return "Фигура: " + getClass().getSimpleName() + ", площадь: " + getArea() + " кв.ед.,"
                + " гипотенуза: " + getHypotenuse() + " ед.," + " цвет: " + getColor();
    }
}


