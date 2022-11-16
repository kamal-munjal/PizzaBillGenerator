package com.company;

public class DeluxPizza extends Pizza{

    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheeze();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheeze() {

    }

    @Override
    public void addExtraToppings() {

    }
}
