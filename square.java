public class square extends Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return side*4;
    }
    @Override
    public double perimeter() {
        return side*side;
    }
}
