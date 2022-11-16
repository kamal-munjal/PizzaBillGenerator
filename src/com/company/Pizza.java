package com.company;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraTopingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheeze(){
        isExtraCheeseAdded = true;
        System.out.println("Extra Cheese Added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraTopingsAdded = true;
        System.out.println("Extra Toppings added");
        this.price += extraToppingsPrice;

    }

    public void takeAway() {
        isOptedForTakeAway = true;
        System.out.println("Take Away opted");
        this.price += backPackPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Base Pizza price Rs. : " + basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added : "+extraCheesePrice + "\n";
        }
        if(isExtraTopingsAdded){
            bill += "Extra Toppings Added : "+extraToppingsPrice+ "\n";
        }
        if(isOptedForTakeAway){
            bill += "Take Away : "+backPackPrice+ "\n";
        }
        bill += "Final Bill : "+this.price+ "\n";
        System.out.println(bill);

    }
}
