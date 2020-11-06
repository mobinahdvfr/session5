import java.util.ArrayList;

/**
 * it keeps a unique rectangle
 * @author Mobina Hadavifar
 * @version 1.0
 */
public class Rectangle {

    private ArrayList<Integer> sides ;

    /**
     * makes a new Rectangle
     * @param a first side
     * @param b second side
     * @param c third side
     * @param d forth side
     */
    public Rectangle (int a, int b, int c, int d){
        sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);
    }

    /**
     * @return list of sides
     */
    public ArrayList<Integer> getSides(){
        return sides;
    }

    /**
     * calculates the perimeter
     * @return perimeter
     */
    public double calculatePerimeter (){
        double tmp =0;
        for (int side : sides){
            tmp = tmp + side;
        }
        return tmp;
    }

    /**
     * calculates area
     * @return area
     */
    public double calculateArea (){
        return (sides.get(0) * sides.get(1));
    }

    /**
     * checks if our rectangle is a square or not
     * @return true if it is and false if not
     */
    public boolean isSquare (){
        int tmp = sides.get(0);
        for (Integer side : sides){
            if (side != tmp)
                return false;
        }
        return true;
    }

    /**
     * prints perimeter and area of rectangle
     */
    public void draw (){
        System.out.println("Rectangle -> Perimeter : " + calculatePerimeter() + " -> Area : " + calculateArea());
    }

    @Override
    public boolean equals (Object o){
        for (Integer side : sides){
            if (side != ((Rectangle)o).getSides().get(sides.indexOf(side))  ){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode (){
        int prime = 37;
        for (Integer side : sides){
            prime = prime + side*17 + 1;
        }
        return prime;
    }

    @Override
    public String toString (){
        String tmp = "Rectangle -> sides : ";
        for (int side : sides){
            tmp  = tmp + side + " ";
        }
        return tmp;
    }

}
