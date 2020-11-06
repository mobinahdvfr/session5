import java.util.ArrayList;
/**
 * it keeps our shapes
 * @author Mobina Hadavifar
 * @version 1.1
 */
public class Paint {

    private ArrayList<Shape> shapes;

    /**
     * makes a new paint
     */
    public Paint (){
        shapes = new ArrayList<>();
    }

    /**
     * adds a new shape
     * @param shape
     */
    public void addShape (Shape shape){
        shapes.add(shape);
    }

    /**
     * calls toString method of shapes
     */
    public void printAll (){
        for (Shape shape : shapes){
            System.out.println(shape.toString());
        }
    }

    /**
     * calls draw method of shapes
     */
    public void drawAll (){
        for (Shape shape : shapes){
            shape.draw();
        }
    }

    /**
     * prints rectangles and triangles with equal sides
     */
    public void describeEqualSides (){
        System.out.println("Shapes with equal sides :");
        for (Shape shape : shapes){
            if (shape instanceof Rectangle){
                if ( ((Rectangle)shape).isSquare()){
                    System.out.println( ((Rectangle)shape).toString() );
                }
            } else if (shape instanceof Triangle){
                if ( ((Triangle)shape).isEquilateral() ){
                    System.out.println( ((Triangle)shape).toString() );
                }
            }
        }
    }

}
