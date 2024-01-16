package baitap7;

public class MyClass {
    private String myString;

    // Constructor không tham số
    public MyClass() {
        this.myString = "Default";
    }

    // Constructor có tham số
    public MyClass(String myString) {
        this.myString = myString;
    }

    // Getter
    public String getMyString() {
        return myString;
    }

    // Setter
    public void setMyString(String myString) {
        this.myString = myString;
    }
}

