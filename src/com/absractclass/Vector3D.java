package com.absractclass;
import java.text.DecimalFormat;
class Vector3D extends Norm {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    double calculateNorm() {
        return Math.max(Math.abs(x), Math.max(Math.abs(y), Math.abs(z)));
    }

    @Override
    double calculateModule() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    void printNorm() {
        double norm = calculateNorm();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Norm of Vector3D: " + df.format(norm));
    }

    @Override
    void printModule() {
        double module = calculateModule();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Module of Vector3D: " + df.format(module));
    }
}
