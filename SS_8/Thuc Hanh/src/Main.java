import thuchanh1.Animal;
import thuchanh1.Dog;
import thuchanh1.Cat;
public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng từ các lớp
        Animal animal1 = new Animal("Pig");
        Dog dog1 = new Dog("Becgie", "black");
        Dog dog2 = new Dog("Pug", "while");
        Cat cat = new Cat("Dora");

        // Dùng các phương thức get/set truy cập và thay đổi thuộc tính
        System.out.println("Động vật thứ nhất trước khi Set có tên là: " + animal1.getName());
        animal1.setName("Bird");
        System.out.println("Động vật thứ nhất sau khi Set có tên là: " + animal1.getName());

        // Truy cập phương thức được kế thừa từ lớp cha.
        dog1.setName("Corgi");
        System.out.println("Tên: " + dog1.getName());
        System.out.println("Tiếng kêu: " + dog1.makeSound());
        System.out.println("Màu lông: " + dog2.getColor());
        System.out.println("Tiếng kêu: " + dog2.makeSound());
        System.out.println("Tên: " + cat.getName());
        System.out.println("Tiếng kêu: " + cat.makeSound());
    }
}
