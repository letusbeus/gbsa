package main.store3D.models;

public class Angle3D {
    private double xAngle; // Угол вращения вокруг оси X
    private double yAngle;   // Угол вращения вокруг оси Y
    private double zAngle;  // Угол вращения вокруг оси Z

    public Angle3D(double xAngle, double yAngle, double zAngle) {
        this.xAngle = xAngle;
        this.yAngle = yAngle;
        this.zAngle = zAngle;
    }

    // Геттеры и сеттеры
    public double getxAngle() {
        return xAngle;
    }

    public void setxAngle(double xAngle) {
        this.xAngle = xAngle;
    }

    public double getyAngle() {
        return yAngle;
    }

    public void setyAngle(double yAngle) {
        this.yAngle = yAngle;
    }

    public double getzAngle() {
        return zAngle;
    }

    public void setzAngle(double zAngle) {
        this.zAngle = zAngle;
    }

    @Override
    public String toString() {
        return "Angle3D{" +
                "pitch=" + xAngle +
                ", yaw=" + yAngle +
                ", roll=" + zAngle +
                '}';
    }
}
