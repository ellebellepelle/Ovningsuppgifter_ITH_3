package me.ellebelle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Product product1 = new Product("Kakaor", 20.50, 8);
        Product product2 = new Product("Mjölk", 15.50, 9);
        Product product3 = new Product("Saft", 10.50, 10);

        IO.println(product1.getName());
        IO.println(product2.getPrice());
        IO.println(product3.getStockQuantity());

        double produkt1TotValue = product1.totalValue();
        IO.println(produkt1TotValue);
    }
}
