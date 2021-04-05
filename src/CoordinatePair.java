public class CoordinatePair {

    private double x;
    private double y;

    public CoordinatePair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistance(CoordinatePair p2) {
        return Math.sqrt(Math.pow((this.x - p2.getX()),2) + Math.pow((this.y - p2.getY()),2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
