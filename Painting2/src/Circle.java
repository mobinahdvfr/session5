/**
 * handles circles
 * @author Mobina Hadavifar
 * @version 1.1
 */
public class Circle extends Shape {

    private int radius;

    /**
     * makes a new circle
     * @param radius of circle
     */
    public Circle (int radius){
        super();
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return (2*radius*3.14);
    }

    @Override
    public double calculateArea() {
        return (radius*radius*3.14);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public boolean equals(Object o) {
        return ( ((Circle)o).radius == this.radius );
    }

    @Override
    public String toString() {
        return "Circle:: radius:" + radius;
    }
}
