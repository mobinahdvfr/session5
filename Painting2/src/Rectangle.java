/**
 * handles rectangles
 * @author Mobina Hadavifar
 * @version 1.1
 */
public class Rectangle extends Polygon {

    /**
     * makes a new Rectangle
     * @param a first side
     * @param b second side
     * @param c third side
     * @param d forth side
     */
    public Rectangle (int a, int b, int c, int d){
        super(a,b,c,d);
    }

    /**
     * checks if our rectangle is a square or not
     * @return true if it is and false if not
     */
    public boolean isSquare (){
        return super.areSidesEqual();
    }

    @Override
    public void draw(){
        super.draw();
    }

    @Override
    public double calculateArea (){
        return (super.getSides().get(0) * super.getSides().get(1));
    }

    @Override
    public String toString (){
        return "Rectangle:: " + super.toString();
    }

}
