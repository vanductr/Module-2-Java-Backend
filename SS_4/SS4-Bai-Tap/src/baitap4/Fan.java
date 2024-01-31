package baitap4;

public class Fan {
    // 'final': Khai báo biến là 1 biến hằng, biến này chỉ có thể gán giá trị 1 lần
    // và giá trị đó sẽ không thể thay đổi.
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Phương thức khởi tạo không tham số
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    // Getter và Setter cho speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter và Setter cho on
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter và Setter cho radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter và Setter cho color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức toString()
    public String toString() {
        if(on) {
            return "Quạt đang bật\nTốc độ: " + speed + "\nMàu quạt: " + color + "\nBán kính Quạt: " + radius;
        } else {
            return "Quạt đang tắt\nMàu quạt: " + color + "\nbán kính quạt: " + radius;
        }
    }
}






















