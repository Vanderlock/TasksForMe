//Exercise 3: (2) Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a
//Shape, then downcast it back to a Rhomboid. Try downcasting to a Circle and see what
//happens.

//Exercise 4: (2) Modify the previous exercise so that it uses instanceof to check the type
//before performing the downcast.




import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList) {
            shape.draw();
        }

        System.out.println("Upcast");
        Shape shape = new Rhomboid();
        shape.draw();
        System.out.println("Downcast");
        Rhomboid rhomboid = (Rhomboid) shape;
        rhomboid.draw();
        Circle circle = null;

        if (shape instanceof Circle) {
            //downcast
            circle = (Circle) shape;
        } else {
            System.out.println("not a Circle");
        }



    }
}
