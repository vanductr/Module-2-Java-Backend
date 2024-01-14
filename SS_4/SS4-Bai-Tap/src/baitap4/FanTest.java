package baitap4;

// Chương trình hiển thị thông tin của 2 đối tượng Fan
public class FanTest {
    public static void main(String[] args) {
        // Tạo đối tượng Fan 1
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);

        // Tạo đối tượng Fan 2
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(15);
        fan2.setOn(false);

        // Hiển thị thông tin của fan1 và fan2
        System.out.println("fan1:\n" + fan1.toString() + "\n");
        System.out.println("fan2:\n" + fan2.toString());
    }
}
