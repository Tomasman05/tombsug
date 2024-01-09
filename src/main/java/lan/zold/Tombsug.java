package lan.zold;

public class Tombsug {
    public double calcRadius(double side, double angle ){
        double angleInRadians = Math.toRadians(angle);
        return (0.5)*side*Math.sin(angleInRadians);
    }
}
