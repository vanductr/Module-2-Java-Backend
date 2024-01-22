package thuchanh4;

public class Main {
    public static void main(String[] args) {
        // Kiểm thử Class Shape
        System.out.println("----------SHAPE------------");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        // Kiểm thử Class Circle
        System.out.println("----------CIRCLE------------");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        // Kiểm thử Rectangle
        System.out.println("-----------RECTANGLE--------------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 3.8, "orange", true);
        System.out.println(rectangle);

        // Kiểm thử SQUARE
        System.out.println("---------------SQUARE-----------------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

    }
}
























