package baitap15;

public class Student {
    private int studentId;
    private String name;
    private double averageScore;

    // Constructor
    public Student(int studentId, String name, double averageScore) {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
    }

    // Getter và setter cho studentId
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter và setter cho name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter và setter cho averageScore
    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    // Phương thức toString để hiển thị thông tin của sinh viên
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}

