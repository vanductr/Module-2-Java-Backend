package thuchanh1;

public class Dog extends Animal{
    private String color;
    public Dog() {

    }
    public Dog(String name, String color) {
        // Gọi đến contructor của lớp Animal
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Gau Gau";
    }
}































