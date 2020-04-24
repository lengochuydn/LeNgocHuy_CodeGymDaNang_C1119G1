package Advanced.BaiTap.interfaceResizeable;

public class Square extends Shape implements Resizeable {
    private double side = 1.0;

    public Square() {

    }
    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +" Area="+getArea()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side += (percent / 100);
    }
}
