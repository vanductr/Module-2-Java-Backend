package ss9.baitap1;

import ss9.baitap2.Colorable;

public class Main {
    public static void main(String[] args) {
//Kiểm thử Class Shape
        System.out.println("-------- - SHAPE----------");

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

//kiểm thử Class Circle
        System.out.println("-------- - CIRCLE----------");

        Circle circle = new Circle(); // Tạo 1 đối tượng hình tròn
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        // Sử dụng phương thức resize(thay đổi kích thước) để thay đổi kích thước của hình tròn
        circle.resize(10);
        System.out.println(circle);
//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle(); // Khởi tạo 1 đối tượng hình chữ nhật
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        // Sử dụng phương thức resize để thay đổi kích thước của đối tượng
        rectangle.resize(5);
        System.out.println(rectangle);
//Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        square.resize(2);
        System.out.println(square);


        // Tạo 1 mảng các đối tượng hình học
        Shape[] shapesArray = new Shape[3];
        shapesArray[0] = new Circle(5);
        shapesArray[1] = new Rectangle(5, 5);
        shapesArray[2] = new Square(4);


        // Hiển thị diện tích của mỗi đối tượng trong mảng
        for (Shape shape1 : shapesArray) {
            System.out.println("Diện tích: " + shape1);

            // Kiểm tra nếu đối tượng là 1 Colorable, gọi howToColor()
            if(shape1 instanceof Colorable) {
                Colorable colorable = (Colorable) shape1;
                colorable.howToColor();
            }
        }

    }
}






















