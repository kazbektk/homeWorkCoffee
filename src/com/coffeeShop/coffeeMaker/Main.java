package com.coffeeShop.coffeeMaker;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        final float MILK_PRICE = 150;
        final float SYRUP_PRICE = 250;
        Map<String, Float> drinkMenu = new HashMap<String, Float>();
        drinkMenu.put("Espresso", 800f);
        drinkMenu.put("Americano", 900f);
        drinkMenu.put("Capuccino", 1200f);
        drinkMenu.put("Latte", 1200f);

        List<String> milkTypes = new ArrayList<String>();
        milkTypes.add("кокосовое молоко");
        milkTypes.add("соевое молоко");
        milkTypes.add("обезжиренное молоко");

        List<String> drinks = new ArrayList<String>();
        drinks.add("Espresso");
        drinks.add("Americano");
        drinks.add("Capuccino");
        drinks.add("Latte");


        List<String> syrups = new ArrayList<String>();
        syrups.add("клубничный сироп");
        syrups.add("кокосовый сироп");
        syrups.add("банановый сироп");

        System.out.println("Добро пожаловать в Кофешоп!");
        System.out.println("Какой кофе желаете?");
        boolean correctChoice;
        Scanner choice = new Scanner(System.in);
        int totalPrice = 0;
        int drinkChoice;
        do {
            System.out.println(" 1 - эспрессо");
            System.out.println(" 2 - американо");
            System.out.println(" 3 - каппучино");
            System.out.println(" 4 - латте");
            System.out.print("Введите номер: ");
            drinkChoice = choice.nextInt();
            if(drinkChoice< 1 || drinkChoice > 4) {
                System.out.println("такого пункта в меню нет. Пожалуйста, повторите выбор:");
                correctChoice = false;
            }
            else {
                correctChoice = true;
                totalPrice += drinkMenu.get(drinks.get(drinkChoice - 1));
            }
        }while(!correctChoice);

        System.out.println();
        System.out.println("Какой тип молока хотите?");
        int milkChoice;
        do {
            System.out.println("0 - без молока");
            System.out.println("1 -  кокосовое молоко");
            System.out.println("2 - соевое молоко");
            System.out.println("3 - обезжиренное молоко");
            milkChoice = choice.nextInt();
            if (milkChoice < 0 || milkChoice > 3) {
                System.out.println("такого пункта в меню нет. Пожалуйста, повторите выбор:");
                correctChoice = false;
            } else {
                correctChoice = true;
                if(milkChoice != 0)
                    totalPrice += MILK_PRICE;
            }
        }while(!correctChoice);

        System.out.println();
        System.out.println("Какой сироп хотите?");
        int syrupChoice;
        do{
            System.out.println("0 - без сиропа");
            System.out.println("1 - клубничный сироп");
            System.out.println("2 - кокосовый сироп");
            System.out.println("3 - банановый сироп");
            syrupChoice = choice.nextInt();
            if (syrupChoice < 0 || syrupChoice > 3) {
                System.out.println("такого пункта в меню нет. Пожалуйста, повторите выбор:");
                correctChoice = false;
            } else {
                correctChoice = true;
                if(syrupChoice != 0)
                    totalPrice += SYRUP_PRICE;
            }
        }while (!correctChoice);

        System.out.println();
        System.out.println("Введите ваше имя:");
        String userName = choice.next();

        Coffee userCoffee = new Coffee(drinks.get(drinkChoice - 1), totalPrice);
        if(milkChoice !=0)
            userCoffee.setMilkType(milkTypes.get(milkChoice-1));

        else
            userCoffee.setMilkType(null);
        if(syrupChoice != 0)
            userCoffee.setSyrup(syrups.get(syrupChoice - 1));
        else
            userCoffee.setSyrup(null);
        userCoffee.setNameOnTheCup(userName);

        System.out.println();
        userCoffee.show();


    }
}
