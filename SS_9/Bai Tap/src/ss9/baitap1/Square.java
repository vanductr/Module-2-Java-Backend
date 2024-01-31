package ss9.baitap1;

import ss9.baitap2.Colorable;

public class Square extends Rectangle implements Resizeable, Colorable { // Hình vuông

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }

    // Ghi đè phương thức resize của Interface Resizeable
    public void resize(double percent) {
        double newSize = getSide() * percent;
        setSide(newSize);
    }

    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    // Bắt buộc triển khai phương thức bắt buộc của Interface Colorable

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}















