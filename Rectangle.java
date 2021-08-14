class Rectangle extends Shapes {

    public Rectangle(double length , double width){
        super(length , width);
    }

    @Override
    public double area(){
        double result = getLength()*getWidth();
        return result;
    }
}
