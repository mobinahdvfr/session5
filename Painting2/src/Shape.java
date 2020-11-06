
/**
 * it keeps common methods of shapes
 * @author Mobina Hadavifar
 * @version 1.1
 */
public abstract class Shape {

    /**
     * makes a new shape
     */
    public Shape (){

    }

    /**
     * calculates perimeter of shape
     * @return perimeter
     */
    public abstract double calculatePerimeter();

    /**
     * calculates area of shape
     * @return area
     */
    public abstract double calculateArea();

    /**
     * prints the type, perimeter and area of shape
     */
    public  void draw(){
        if (this instanceof Circle){
            System.out.print("Circle");
        } else if (this instanceof Rectangle){
            System.out.print("Rectangle");
        } else if (this instanceof Triangle){
            System.out.print("Triangle");
        } else {
            return;
        }
        System.out.println(" -> perimeter : " + this.calculatePerimeter() + " -> area : " + this.calculateArea());
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract String toString ();

}
