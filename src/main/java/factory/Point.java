package factory;

public class Point {

    private double x,y;

    private Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    public static class Factory{

        public static Point newCartesianPoint(double x, double y){
            return new Point(x,y);
        }

        public static Point newPolarPoint(double rho, double theta){
            return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        Point cartesianPoint = Point.Factory.newCartesianPoint(5,6);
        Point polarPoint = Point.Factory.newPolarPoint(5,0.5);
        System.out.println("Cartesian Points : X:"+cartesianPoint.getX()+" Y:"+cartesianPoint.getY());
        System.out.println("Polar Points : X:"+polarPoint.getX()+" Y:"+polarPoint.getY());
    }


}
