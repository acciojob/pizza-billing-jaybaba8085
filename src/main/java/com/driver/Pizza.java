package com.driver;
public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private int paperbag;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isPaperbagAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg) {

        this.isVeg = isVeg;

        this.cheese = 80;
        this.paperbag = 20;

        if (isVeg == true) {
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isPaperbagAdded = false;
        this.isBillGenerated = false;

        this.bill = "Base Price Of The Pizza: "+price +"\n";
        // your code goes here
    }

    public int getPrice() {
 
        return this.price;
    }

    public void addExtraCheese() {

        // your code goes here
        if (isCheeseAdded == false) {
            this.price = this.price + this.cheese;
            isCheeseAdded = true;

        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (isToppingsAdded == false) {
            this.price = this.price + this.toppings;
            isToppingsAdded = true;

        }
    }

    public void addTakeaway() {
        // your code goes here
        if (isPaperbagAdded == false) {
            this.price = this.price + this.paperbag;
            isPaperbagAdded = true;

        }
    }

    public String getBill() {
        // your code goes here
        if (isBillGenerated == false) {

            if (isCheeseAdded==true) {
                this.bill = this.bill +"Extra Cheese Added: " + this.cheese + "\n";

            }
            if (isToppingsAdded==true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isPaperbagAdded==true) {
                this.bill = this.bill + "Paperbag Added: " + this.paperbag + "\n";
            }
            this.bill = this.bill +"Total Price: "+ this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
