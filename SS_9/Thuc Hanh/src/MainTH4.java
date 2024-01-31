import thuchanh4.Student;
import thuchanh4.Teacher;

public class MainTH4 {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng học sinh và giáo viên
        Student student1 = new Student("Trần Văn A", 20);
        Student student2 = new Student("Trần Văn B", 22);
        Student student3 = new Student("Trần Văn C", 21);

        Teacher teacher1 = new Teacher("Nguyễn Văn D", 36);
        Teacher teacher2 = new Teacher("Nguyễn Văn E", 36);


        // Hiển thị thông tin của học sinh và giáo viên
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        teacher1.displayInfo();
        teacher2.displayInfo();
    }
}
