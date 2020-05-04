public class Circle {
    private String color="black";
    private double radius =1.0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(){

    }
    public Circle(String color,double radius){
        this.color =color;
        this.radius =radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString(){
     return "hinh nay thuoc lop hinh tron, co mau: "+color+", va ban kinh: "+radius;
    }
}
