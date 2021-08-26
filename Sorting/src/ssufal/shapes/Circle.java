package ssufal.shapes;

public class Circle extends Shape{

    public Circle(int radius){
        super(radius);
    }

    public void area () {
        System.out.println(Math.PI * length * length);
    }

}
