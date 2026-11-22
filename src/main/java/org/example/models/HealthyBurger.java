
package org.example.models;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;

        super.addHamburgerAddition4(name, price);
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;

        super.addHamburgerAddition4(name, price);
    }

    @Override
    public double itemizeHamburger() {

        double total = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            System.out.println("Healthy Extra: " + healthyExtra1Name
                    + " - " + healthyExtra1Price);
        }

        if (healthyExtra2Name != null) {
            System.out.println("Healthy Extra: " + healthyExtra2Name
                    + " - " + healthyExtra2Price);
        }

        System.out.println("Healthy Burger Total: " + total);

        return total;
    }
}
