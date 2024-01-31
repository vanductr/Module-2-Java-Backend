package ss9.thuchanh1;

import ss9.thuchanh1.animals.Animal;
import ss9.thuchanh1.animals.Chicken;
import ss9.thuchanh1.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2]; // Khởi tạo 1 mảng có kiểu dữ liệu là Animal
        animals[0] = new Tiger(); // Gọi contructor của Tiger. Khởi tạo đối tượng thứ nhất
        animals[1] = new Chicken(); // Gọi contructor của Chicken. Khởi tạo đối tượng thứ hai

        // Dùng vòng for(giống với for-in bên JS để lấy từng phần tử trong mảng animals)
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}
