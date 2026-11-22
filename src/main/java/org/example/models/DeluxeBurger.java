
package org.example.models;

public class DeluxeBurger extends Hamburger {

    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", 19.10, "White");

        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public double itemizeHamburger() {
        double total = super.itemizeHamburger();

        System.out.println("Included chips: " + cips);
        System.out.println("Included drink: " + drink);

        return total;
    }
}
