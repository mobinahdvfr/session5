
/**
 * it keeps a unique circle
 * @author Mobina Hadavifar
 * @version 1.0
 */
public class Circle {

    private int radius;

    /**
     * makes a new circle
     * @param radius circle's radius
     */
    public Circle (int radius){
        this.radius = radius;
    }

    /**
     * @return radius
     */
    public int getRadius (){
        return radius;
    }

    /**
     * calculates the perimeter of circle
     * @return perimeter
     */
    public double calculatePerimeter (){
        return (2*radius*3.14);
    }

    /**
     * calculates the area of circle
     * @return area
     */
    public double calculateArea (){
        return (radius*radius*3.14);
    }

    /**
     * will prints the perimeter and area of circle
     */
    public void draw (){
        System.out.println("Circle -> Perimeter : " + calculatePerimeter() + " -> Area : " + calculateArea());
    }

    @Override
    public boolean equals (Object o ){
        return ( ( (Circle)o ).getRadius() == this.getRadius() );
    }

    @Override
    public int hashCode (){
        int prime = 37;
        prime = prime + radius*17;
        return prime;
    }

    @Override
    public String toString (){
        return ("Circle -> r : " +radius);
    }



}
