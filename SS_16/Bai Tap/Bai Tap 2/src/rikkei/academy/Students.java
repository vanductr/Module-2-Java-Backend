package rikkei.academy;

public class Students {
    private int id;
    private String name;
    private double score;

    public Students() {
    }

    public Students(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Phương thức để hiển thị thông tin học sinh
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
}
