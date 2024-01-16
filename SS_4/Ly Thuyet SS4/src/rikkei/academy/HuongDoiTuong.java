package rikkei.academy;

public class HuongDoiTuong {
    // 4 tính chất của OOP (lập trình hướng đối tượng)
    // + Tính đóng gói
    // + Tính kế thừa
    // + Tính trừu tượng
    // + Tính đa hình

    // function, method, procedune : Thủ tục (chứa nhiều dòng mã để thực hiện 1 chức năng)

    // Lớp là đơn vị thực thi cơ bản trong ngôn ngữ Java.
    // Khai báo lớp cũng là hành vi khai báo 1 kiểu dữ liệu trong Java.

    // Pham vi truy cập của thuộc tính và phươn thức
    // - PUBLIC: Công khai- truy cập mọi nơi
    // - PROTECTED: cho phép truy cập cùng package
    // -

    // 1. Lớp - class : mô hình tạo ra các đối tượng
    // 1.1  Thuộc tính: nên để phạm vi truy cập private
    // 1.2  Các phương thức: constructors, Getter/Setter, các phương thức khác: toString.

    // 2. Đối tượng: object là 1 trường hợp cụ thể của lớp
    // - Cách khởi tạo: Tên_Class Tên_Đối_Tượng = new Constructor(args);
    // - Truy cập phương thức và thuộc tính bằng dấu "."

    // 3. Phạm vi truy cập: Access modify
    // - public, protected, default, private


    // Bài tập: tạo lớp Student: id, name, birthday, add

    public static void main(String[] args) {
        // Cú pháp khởi tạo đối tượng
        Person person1 = new Person(); //(từ khoá new: cấp phát vùng nhớ động )

        person1.setWeight(75);
        person1.setHeight(1.75f);

        System.out.println("Height = " + person1.getHeight());
        System.out.println("Weight = " + person1.getWeight());

        System.out.println("bmi =" + person1.getBMI());

        System.out.println(person1);
    }
}
