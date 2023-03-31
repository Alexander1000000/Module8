public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setFillColor("Red");
        circle.setBorderColor("Blue");
        circle.setX(10.0);
        circle.setY(20.0);
        circle.setRadius(5.0);

        Ellipse ellipse = new Ellipse();
        ellipse.setName("Ellipse");
        ellipse.setFillColor("Green");
        ellipse.setBorderColor("Yellow");
        ellipse.setX(30.0);
        ellipse.setY(40.0);
        ellipse.setRadius(6.0);
        ellipse.setRadius2(4.0);

        Quad quad = new Quad();
        quad.setName("Square");
        quad.setFillColor("Blue");
        quad.setBorderColor("Red");
        quad.setX(50.0);
        quad.setY(60.0);
        quad.setSideLength(10.0);

        Rectangle rectangle = new Rectangle();
        rectangle.setName("Rectangle");
        rectangle.setFillColor("Yellow");
        rectangle.setBorderColor("Green");
        rectangle.setX(70.0);
        rectangle.setY(80.0);
        rectangle.setSideLength(8.0);
        rectangle.setSideWidth(12.0);

        Triangle triangle = new Triangle();
        triangle.setName("Rectangle");
        triangle.setFillColor("Yellow");
        triangle.setBorderColor("Green");
        triangle.setX(90.0);
        triangle.setY(100.0);
        triangle.setSide1(6.0);
        triangle.setSide2(8.0);
        triangle.setSide3(10.0);

        PrintShapeName printer = new PrintShapeName();
        printer.printShapeName(circle);
        circle.displayInfo();

        printer.printShapeName(ellipse);
        ellipse.displayInfo();

        printer.printShapeName(quad);
        quad.displayInfo();

        printer.printShapeName(rectangle);
        rectangle.displayInfo();

        printer.printShapeName(triangle);
        triangle.displayInfo();

        Circle clonedCircle = (Circle) circle.clone();
        clonedCircle.setName("Cloned Circle");
        clonedCircle.setBorderColor("Black");
        clonedCircle.setX(30.0);
        printer.printShapeName(clonedCircle);
        clonedCircle.displayInfo();
    }
}