package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class SortingStudent {
    public static Students[] studentsList = new Students[5];

    static {
        studentsList[0] = new Students(1, "Tran Van A", 7.5);
        studentsList[1] = new Students(2, "Tran Van B", 8.5);
        studentsList[2] = new Students(3, "Tran Van C", 7.8);
        studentsList[3] = new Students(4, "Tran Van D", 9.2);
        studentsList[4] = new Students(5, "Tran Van E", 8.3);
    }

    public static void main(String[] args) {
        Students[] studentsList1 = insertionSort(studentsList);
        Students[] studentsList2 = selectionSort(studentsList);
        displayStudentInfo(studentsList2);
    }

    private static void displayStudentInfo(Students[] studentsList) {
        for (Students student : studentsList) {
            student.displayStudentInfo();
            System.out.println("--------------------------------------");
        }
    }

    // Phương thức sắp xếp kiểu: Chèn
    private static Students[] insertionSort(Students[] students) {
        for (int i = 1; i < students.length; i++) {
            Students keyStudent = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getScore() < keyStudent.getScore()) {
                students[j + 1] = students[j];
                j = j - 1;
            }

            students[j + 1] = keyStudent;
        }
        return students;
    }

    // Phương thức sắp xếp kiểu: Chọn
    private static Students[] selectionSort(Students[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            Students phanTuLonNhat = students[i];
            int indexPhanTuLonNhat = i;

            for (int j = i + 1; j < students.length; j++) {
                if (phanTuLonNhat.getScore() < students[j].getScore()) {
                    phanTuLonNhat = students[j];
                    indexPhanTuLonNhat = j;
                }
            }

            if (indexPhanTuLonNhat != i) {
                students[indexPhanTuLonNhat] = students[i];
                students[i] = phanTuLonNhat;
            }
        }
        return students;
    }

    // Phương thức sắp xếp kiểu: Nổi bọt
    private static Students[] bubbleSort(Students[] students) {

    }
}














