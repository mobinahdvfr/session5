import java.util.ArrayList;

/**
 * it keeps our 3 shapes
 * @author Mobina Hadavifar
 * @version 1.0
 */
public class Paint {

    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Triangle> triangles;

    /**
     * makes a new paint
     */
    public Paint (){
        circles = new ArrayList<>();
        rectangles = new ArrayList<>();
        triangles = new ArrayList<>();
    }

    /**
     * adds a new triangle to triangles list
     * @param triangle we want to add
     */
    public void addTriangle (Triangle triangle){
        triangles.add(triangle);
    }

    /**
     * adds a new circle to circles list
     * @param circle we want to add
     */
    public void addCircle (Circle circle){
        circles.add(circle);
    }

    /**
     * adds a new rectangle to rectangles list
     * @param rectangle we want to add
     */
    public void addRectangle (Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     * calls shapes draw method
     */
    public void drawAll (){
        for (Circle circle : circles){
            circle.draw();
        }
        for (Rectangle rectangle : rectangles){
            rectangle.draw();
        }
        for (Triangle triangle : triangles){
            triangle.draw();
        }
    }

    /**
     * calls shapes toString method
     */
    public void printAll (){
        for (Circle circle : circles){
            System.out.println( circle.toString() );
        }
        for (Rectangle rectangle : rectangles){
            System.out.println( rectangle.toString() );
        }
        for (Triangle triangle : triangles){
            System.out.println( triangle.toString() );
        }

    }

}
