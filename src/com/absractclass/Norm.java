package com.absractclass;
abstract class Norm {
    abstract double calculateNorm();
    abstract double calculateModule();

    public void findNormType() {
        System.out.println(this.getClass().getSimpleName());
    }

    abstract void printNorm();

    abstract void printModule();
}
