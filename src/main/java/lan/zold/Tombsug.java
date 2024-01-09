package lan.zold;

import java.util.InputMismatchException;

public class Tombsug {
    public double calcRadius(double side, double angle ){
        if (side<=0 || angle<=0) {
            throw new InputMismatchException();
        }
        double angleInRadians = Math.toRadians(angle);
        return (1.0/2.0)*side*Math.sin(angleInRadians);
    }
}
