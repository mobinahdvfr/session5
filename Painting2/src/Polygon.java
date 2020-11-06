import java.util.ArrayList;
/**
 * handles polygons
 * @author Mobina Hadavifar
 * @version 1.1
 */
public class Polygon extends Shape {

    private ArrayList<Integer> sides;

    /**
     * makes a new polygon
     * @param sideNumbers sides
     */
    public Polygon (int... sideNumbers){
        sides = new ArrayList<>();
        for (int sideNumber : sideNumbers){
            sides.add(sideNumber);
        }
    }

    /**
     * @return list of sides
     */
    public ArrayList<Integer> getSides(){
        return sides;
    }

    /**
     * checks if sides are equal or not
     * @return true if they are and false if not
     */
    public boolean areSidesEqual (){
        int tmpSide = sides.get(0);
        for (Integer side : sides){
            if (side != tmpSide){
                return false;
            }
        }
        return true;
    }

    @Override
    public double calculatePerimeter() {
        int perimeter = 0 ;
        for (Integer side : sides){
            perimeter = perimeter + side;
        }
        return perimeter;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public String toString() {
        int i =1;
        String str = "";
        for (Integer side : sides){
            str = str + "side" + i + ":" + side;
            if (i < sides.size())
                str = str + ", ";
            i++;
        }
        return str;
    }
}
