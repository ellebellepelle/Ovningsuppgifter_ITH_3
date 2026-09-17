package me.ellebelle;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;


    // Konstruktor, när jag gör denna så försvinner min default och jag behöver gör en
    // egen tom konstruktor
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    // Den tomma konstruktorn:
    public Triangle() {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }



    // Metod som returnerar omkretsen:
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    // Metod som returnerar true om triangelolikheten är uppfylld
    // (summan av två sidor måste alltid vara större än den tredje sidan)
    // annas false.
    public boolean isValidTriangle() {

    }

}
