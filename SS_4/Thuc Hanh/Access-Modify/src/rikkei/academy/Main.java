package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        // Tạo các đối tượng từ lớp Person
        Person person1 = new Person("Trung", "Nguyễn", 24, true);
        Person person2 = new Person("Hà", "Lê", 22, false);

        // Truy cập trực tiếp các thuộc tính của đối tượng
        //System.out.println(person1.firstName); // Không thể truy cập trực tiếp thuộc tính private

        // Truy cập gián tiếp qua phương thức getter/setter
        System.out.println(person1.getFirstName()); // "Trung"
        System.out.println("Tên đầy đủ của person2: " + person2.getFirstName() + " " + person2.getLastName());
    }
}
