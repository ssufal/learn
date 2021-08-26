package ssufal.shapes;

import java.util.Scanner;

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the width of the Square and then Enter:");
        int x = sc.nextInt();
        Square a = new Square(x);
        System.out.print("Area of the Square is: ");
        a.area();
        System.out.println("Please type the radius of the Circle and then Enter:");
        int y = sc.nextInt();
        Circle b = new Circle(y);
        System.out.print("Area of the Circle is: ");
        b.area();
    }
}
