package com.absractclass;
public class Main {
    public static void main(String[] args) {
        Norm complex = new Complex(5.3, 8.7);
        complex.findNormType();
        complex.printModule();
        complex.printNorm();
        System.out.println();
        Norm vector = new Vector3D(4.5, 7.5, 10.3);
        vector.findNormType();
        vector.printModule();
        vector.printNorm();
    }
}