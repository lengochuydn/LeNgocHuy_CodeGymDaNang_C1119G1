package KeThua.BaiTap.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.height*Math.PI*super.getRadius()*super.getRadius();
    }
    @Override
    public String toString(){
        return "A cylinder with radius"
                +super.getRadius()
                +", color "
                +super.getColor()
                +" , height"
                +this.height
                +" and Volume"
                +getVolume();
    }
}
