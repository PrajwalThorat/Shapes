abstract class Shapes {
    private double width ;
    private double length;


    public Shapes(double width , double length){
        this.length = length;
        this.width = width ;
    }
    public abstract double area();

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

}
