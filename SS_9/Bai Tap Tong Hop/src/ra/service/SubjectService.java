package ra.service;

import ra.model.Subject;

import java.util.Scanner;

public class SubjectService {
    // Tạo 1 mảng ban đầu
    public static Subject[] subjects = new Subject[0];

    // Phương thức tìm đối tượng(Môn học) theo ID
    public static Subject findSubjectById(int id) {
        // Dùng for-i để lặp qua từng Đối tượng trong Mảng
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].getSubjectId() == id) {
                return subjects[i];
            }
        }

        // Nếu không tìm thấy trả về null
        return null;
    }

    // Phương thức Thêm Môn học
    public static void addNewSubject() {
        System.out.println();
        System.out.println("-----Nhập thông tin Môn học mới:------");

        // Tạo 1 Mảng mới có độ dài lớn hơn mảng ban đầu là 1
        Subject[] newSubjects = new Subject[subjects.length + 1];

        // Dùng vòng fori copy mảng cũ sang mảng mới
        for (int i = 0; i < subjects.length; i++) {
            newSubjects[i] = subjects[i];
        }

        // Tạo 1 đối tượng từ lớp Subject để có thể sử dụng các thuộc tính
        // và phương thức của lớp này
        Subject subject = new Subject();
        subject.inputSubjectInfo(); // Gọi đến phương thức lấy thông tin của Lớp.

        // Đưa đối tượng mới vào trong Mảng danh sách (vị trí cuối cùng của Mảng)
        newSubjects[subjects.length] = subject;

        // Gán lại gía trị của Mảng ban đầu
        subjects = newSubjects;
    }

    // Phương thức Hiển thị Tất cả môn học
    public static void displayAllSubjectList() {
        if (subjects.length == 0) {
            System.out.println();
            System.out.println("Danh sách môn học trống !!!");
            return;
        }

        // Thông báo cho người dùng biết(UI-UX)
        System.out.println("-----Danh sách Thông tin tất cả Môn học------");
        System.out.println();

        // Dùng vòng lặp forEarch để lặp qua từng phần tử trong Mảng
        for (Subject subject : subjects) {
            subject.displaySubjectInfo();

            // Dòng ngăn cách giữa các Môn học
            System.out.println("----------------------------------------------");
        }
    }

    // Phương thức sửa thông tin môn học theo ID
    public static void editSubjectById(Scanner scanner) {
        // Hướng dẫn cho người dùng nhập vào Id của Môn học cần sửa
        System.out.println();
        System.out.print("Nhập ID của Môn học cần sửa: ");

        //Lấy id người dùng nhập vào và gán vào 1 biến
        int id = Integer.parseInt(scanner.nextLine());

        // Dùng phương thức tìm Đối tượng bởi ID để tìm ra đối tượng cần sửa
        Subject subject = findSubjectById(id);

        if (subject == null) {
            System.out.println("Không thể tìm thấy Môn học có ID: " + id);
            return;
        }

        // Hiển thị cho người dùng biết 'Đối tượng này đang cần sửa'
        System.out.println("----- Đây là thông tin Môn học cần sửa ---------");
        subject.displaySubjectInfo();
        System.out.println();

        // Lấy dữ liệu của người dùng nhập vào
        System.out.println("----- Nhập thông tin mới của Môn học ------");
        subject.inputSubjectInfo();

        // Thông báo cho người dùng biết là đã chỉnh sửa thành công
        System.out.println("Thông tin môn học đã được chỉnh sửa thành công.");
    }

    // Phương thức thay đổi trạng thái môn học
    public static void changeSubjectStatus(Scanner scanner) {
        // Nếu mảng trống thì chỉ dẫn cho người dùng và thoát vòng lặp
        if (subjects.length == 0) {
            System.out.println();
            System.out.println("Danh sách môn học trống!!!");
            return;
        }

        // Lấy id của người dùng nhập vào
        System.out.print("Nhập ID của Môn học muốn thay đổi trạng thái: ");
        int id = Integer.parseInt(scanner.nextLine());

        // Sử dụng phương thức tìm đối tượng thông qua ID
        Subject subject = findSubjectById(id);

        // Nếu không tìm thấy
        if (subject == null) {
            System.out.println("Không tìm thấy Môn học có ID: " + id);
            return;
        }

        // Nếu tìm thấy, thì hiển thị ra thông tin của Môn học đó
        System.out.println("Đây là thông tin của Môn học bạn muốn thay đổi trạng thái:");
        System.out.println();
        subject.displaySubjectInfo();

        System.out.println();
        System.out.println("Nhập 1 để thay đổi trạng thái, 0 để giữ nguyên trạng thái.");
        System.out.println();
        while (true) {
            System.out.print("Nhập lựa chọn: ");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    subject.setSubjectStatus(!subject.isSubjectStatus());
                    System.out.println("Trạng thái Môn học đã được thay đổi.");
                    return;
                case 0:
                    System.out.println("Trạng thái Môn học vẫn được giữ nguyên.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}






























