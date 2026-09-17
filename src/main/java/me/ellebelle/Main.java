package me.ellebelle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // ////////////////////////////////////////////////
        // UPPGIFT 1.1
        Product product1 = new Product("Kakaor", 20.50, 8);
        Product product2 = new Product("Mjölk", 15.50, 9);
        Product product3 = new Product("Saft", 10.50, 10);

        IO.println(product1.getName());
        IO.println(product2.getPrice());
        IO.println(product3.getStockQuantity());

        double produkt1TotValue = product1.totalValue();
        IO.println(produkt1TotValue);
        IO.println("================= SLUT PÅ UPPGIFT 1.1 ==================");




        // ////////////////////////////////////////////////
        // UPPGIFT 1.2

        // Utan att gjort nångon konstruktor så används default-konstruktorn
        // och eftersom jag inte har några värden på mina fält i Triangle-klassen
        // så får alla fälten värdena 0.0
        Triangle triangle1 = new Triangle();
        // sen får jag lägga till värden med mina getters och setters.
        triangle1.setSideA(5);
        triangle1.setSideB(10);
        triangle1.setSideC(7);
        // skriver ut objektet med en metod från Trangle-klassen
        IO.println(triangle1.perimeter());

        // Här änvänder jag min konstruktor som tar tre parametrar som jag gjort sj.
        Triangle triangle2 = new Triangle(5.5, 10.10, 7.7);
        // skriver ut objektet med min egen kostruktor:
        IO.println(triangle2.perimeter());




    }
}
