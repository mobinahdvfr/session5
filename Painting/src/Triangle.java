import java.util.ArrayList;

/**
 * it keeps a unique triangle
 * @author Mobina Hadavifar
 * @version 1.0
 */
public class Triangle {

    private ArrayList<Integer> sides ;

    /**
     * makes a new Triangle
     * @param a first side
     * @param b second side
     * @param c third side
     */
    public Triangle (int a, int b, int c){
        sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    /**
     * @return list of sides
     */
    public ArrayList<Integer> getSides(){
        return sides;
    }

    /**
     * checks if the sides are equal or not
     * @return true if they are and false if not
     */
    public boolean isEquilateral (){
        int tmp = sides.get(0);
        for (Integer side : sides){
            if (side != tmp)
                return false;
        }
        return true;
    }

    /**
     * calculates the perimeter of the triangle
     * @return perimeter
     */
    private double calculatePerimeter (){
        double tmp =0;
        for (int side : sides){
            tmp = tmp + side;
        }
        return tmp;
    }

    /**
     * calculates the area of triangle
     * @return area
     */
    private double calculateArea (){
        double tmp = calculatePerimeter();
        for (Integer side : sides){
            tmp = tmp*(calculatePerimeter()-side);
        }
        tmp =  Math.sqrt(tmp);
        return tmp;
    }

    /**
     *it will print the perimeter and area of triangle
     */
    public void draw (){
        System.out.println("Triangle -> Perimeter : " + calculatePerimeter() + " -> Area : " + calculateArea());
    }

    @Override
    public boolean equals (Object o){
        for (Integer side : sides){
            if (!side.equals(((Rectangle) o).getSides().get(sides.indexOf(side)))){
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
        String tmp = "Triangle -> sides : ";
        for (int side : sides){
            tmp  = tmp + side + " ";
        }
        return tmp;
    }

}
