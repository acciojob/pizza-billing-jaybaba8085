package com.driver;

public class Pizza {

      boolean isTakeAwayAdded;
      boolean isCheesedAdded;
      boolean isToppingAdded;
     Boolean  isBillGenerated;
    private Boolean isVeg;
    private String bill;
    private int price;
    private  int cheesePrice;
    private int toppingPrice;
    private int takeAwayPrice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice = 80;
        //this.toppingPrice = toppingPrice;
        this.takeAwayPrice= 20;

        if(isVeg==true)
        {
            this.price=300;
            this.toppingPrice=70;
        }
        else {
            this.price=400;
            this.toppingPrice=120;
        }
        this.isTakeAwayAdded=false;
        this.isCheesedAdded =false;
        this.isToppingAdded=false;
        this.isBillGenerated=false;

        this.bill="Base Price Of The Pizza: " +this.price +"\n";


    }

    public int getPrice(){
        return this.price ;
    }

    public void addExtraCheese(){
        // your code goes here

        if(isCheesedAdded == false)
        {
            this.price=this.price +this.cheesePrice ;
            isCheesedAdded =true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false) {
            this.price=this.price +this.toppingPrice;
            isToppingAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false) {
            this.price=this.price+ this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
        

    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false)
        {
            isBillGenerated=true;
            if(isCheesedAdded==true)
            {
                this.bill = this.bill + "Extra Cheese Added: "
                        + this.cheesePrice + "\n";
            }
            if(isToppingAdded==true)
                {
                    this.bill = this.bill + "Extra Topping Added: "
                            + this.toppingPrice + "\n";
                }
                if(isTakeAwayAdded==false)
                {
                    this.bill = this.bill + "Paperbag Added: "
                            + this.takeAwayPrice + "\n";
                }
                this.bill = this.bill + "Total Price: " + this.price +"\n";
                isBillGenerated=true;
            }
        return this.bill;
    }
}
