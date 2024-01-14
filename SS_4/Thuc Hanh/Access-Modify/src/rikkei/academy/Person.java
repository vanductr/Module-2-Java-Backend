package rikkei.academy;

// Class 'Person' định nghĩa một đối tượng đại diện cho một người với các thuộc tính cơ bản như
// 'firstName', 'lastName', 'age', 'gender'.
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean gender;

    // Contructor không tham số. Phương thức khởi tạo mặc định không nhận tham số.
    // Nó không làm gì cả khi được gọi. Thường được sử dụng để tạo đối tượng mà sau đó
    // có thể được thiết lập thông tin bằng cách sử dụng các setter.
    public Person() {

    }

    // Contructor với tham số. Phương thức khởi tạo này nhận các tham số để khởi tạo một đối tượng
    // 'Person' với thông tin cụ thể (tên, họ, tuổi, giới tính).
    public Person(String firstName, String lastName, int age, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // 'getFirstName': trả về giá trị của thuộc tính 'firstName'
    // 'setFirstName(String firstName)': Thiết lập giá trị cho 'firstName' dựa trên giá trị được truyền vào.

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        // Tạo các đối tượng từ lớp Person
        Person p1 = new Person("Trung", "Nguyễn", 24, true);
        Person p2 = new Person("Hà", "Phạm", 22, false);

        // Truy cập trực tiếp các thuộc tính của đối tượng
        System.out.println(p1.firstName);

        // Truy cập gían tiếp qua phương thức getter/setter
        System.out.println("Truy cập qua phương thức getter/setter: " + p1.getFirstName());
        System.out.println("Tên đầy đủ của p2 là: " + p2.getFirstName() + p2.getLastName());
    }
}












