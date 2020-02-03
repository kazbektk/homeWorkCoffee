package com.coffeeShop.coffeeMaker;

public class Coffee {
    private String drinkType;
    private String milkType;
    private String syrup;
    private float totalPrice;
    private String nameOnTheCup;

    public Coffee() {
    }
    public Coffee(String drinkType, float totalPrice){
        this.drinkType = drinkType;
        this.totalPrice = totalPrice;
        milkType = null;
        syrup = null;
        nameOnTheCup = null;
    }
    public Coffee(String drinkType, String milkType, String syrup, float totalPrice, String nameOnTheCup){
        this.drinkType = drinkType;
        this.totalPrice = totalPrice;
        this.syrup = syrup;
        this.milkType = milkType;
        this.nameOnTheCup = nameOnTheCup;
    }

    public void show(){
        System.out.println("Кофе для " + nameOnTheCup + ":");
        System.out.println(drinkType);
        if(milkType != null)
            System.out.println("Молоко: " + milkType);
        if(syrup != null)
            System.out.println("Сироп: " + syrup);
        System.out.println("--------------");
        System.out.println("Цена: " + totalPrice + "тг.");
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public String getSyrup() {
        return syrup;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNameOnTheCup() {
        return nameOnTheCup;
    }

    public void setNameOnTheCup(String nameOnTheCup) {
        this.nameOnTheCup = nameOnTheCup;
    }
}
