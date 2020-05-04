public class Cylinder extends Circle {
    private double high =1;

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Cylinder(){
    }

    public Cylinder(double high, double radius,String color){
        super(color, radius);
        this.high=high;
    }
    public double setVolume(){
        return high*super.getArea();
    }

    @Override
    public String toString() {
        return "dien tich " +
                setVolume()+" la hinh tru, "+
         super.toString();
    }
}
