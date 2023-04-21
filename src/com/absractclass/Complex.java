package com.absractclass;
import java.text.DecimalFormat;
class Complex extends Norm {
    private double x;
    private double y;


    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
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


    @Override
    double calculateNorm() {
        return Math.pow(calculateModule(), 2);
    }

    @Override
    double calculateModule() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    void printNorm() {
        double norm = calculateNorm();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Norm of Complex number: " + df.format(norm));
    }

    @Override
    void printModule() {
        double module = calculateModule();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Module of Complex number: " + df.format(module));
    }
}
