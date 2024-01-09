package lan.zold;

public class Tombsug {
    public double calcRadius(double side, double angle ){
        double angleInRadians = Math.toRadians(angle);
        return (1.0/2.0)*side*Math.sin(angleInRadians);
    }
}
