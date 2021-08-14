import java.util.Scanner;

abstract class Shape {
    int width;
    public Shape(int width){
        this.width = width;
    }
    abstract void area();
}

class Square extends Shape{
    public Square (int width) {
        super(width);
    }
    @Override
    void area(){
        System.out.println(width*width);
    }
}
class Circle extends Shape {
    public Circle(int width){
        super(width);
    }
    @Override
    void area(){
        System.out.println((double)Math.PI*width*width);
    }

}
//your code goes here


public class SoloLearnChallenge {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
        sc.close(); 
    }
}