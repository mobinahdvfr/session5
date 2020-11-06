/**
 * handles triangles
 * @author Mobina Hadavifar
 * @version 1.1
 */
public class Triangle extends Polygon {

    /**
     * makes a new Triangle
     * @param a first side
     * @param b second side
     * @param c third side
     */
    public Triangle (int a, int b, int c){
        super(a,b,c);
    }

    /**
     * checks if our triangle is equilateral or not
     * @return true if it is and false if not
     */
    public boolean isEquilateral (){
        return super.areSidesEqual();
    }

    @Override
    public double calculateArea (){
        double tmp = calculatePerimeter();
        for (Integer side : super.getSides()){
            tmp = tmp*(calculatePerimeter()-side);
        }
        tmp = (double) Math.sqrt(tmp);
        return tmp;
    }

    @Override
    public void draw(){
        super.draw();
    }

    @Override
    public String toString (){
        return "Triangle:: " + super.toString();
    }

}
