package TestTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Blazhko Serghii on 10.10.2015.
 */
public class Solution {

    public static void main(String[] args) throws Exception{

        List<Object> list = new ArrayList<>();
        setObject(list);
        showList(list);
    }

    public static void showList(List<Object> list){

        for (Object o : list) {
            if (o instanceof Square)
                System.out.println(((Square) o).draw());
            else if(o instanceof Triangle)
                System.out.println(((Triangle) o).draw());
            else if(o instanceof Circle)
                System.out.println(((Circle) o).draw());
            else
                System.out.println(((Trapeze) o).draw());
        }
    }

    public static void setObject(List<Object> list){

        Random rand = new Random();
        for (int i = 0; i < rand.nextInt(); i++) {list.add(new Square(5));}
        for (int i = 0; i < rand.nextInt(); i++) {list.add(new Triangle(5, 2));}
        for (int i = 0; i < rand.nextInt(); i++) {list.add(new Circle(3));}
        for (int i = 0; i < rand.nextInt(); i++) {list.add(new Trapeze(5, 5, 2));}
    }
}
