package ssufal.shapes;

public class Square extends Shape{

    public Square(int x){
        super(x);
    }

    public void area (){
        int width = length;
        System.out.println(width * width);
    }

}