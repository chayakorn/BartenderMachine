/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bartendermachine;

import java.util.Scanner;

/**
 *
 * @author Chayakorn
 */
public class Machine {

    private int moneyInMachine;
    private int customerCount;
    private int customerChoose;
    private int customerMoney;
    private int menuPrice;
    private Scanner input = new Scanner(System.in);
    private MenuFix[] menu = {new MenuFix("Lemonade", 10, 5000), new MenuFix("Grape Fruit Rosemarry", 15, 5000), new MenuFix("Chirley Temple", 20, 8000), new MenuFix("Strawberry Lemonade", 20, 10000), new MenuFix("Pineaple Cherry Mocktail", 25, 20000)};
    private long time;
    private int totalPrice = 0;
    private Ingredients[] ingredients = {new Ingredients("WATER", 5), new Ingredients("LEMON", 6), new Ingredients("BROWNSUGAR", 6), new Ingredients("COLDWATER", 5), new Ingredients("ICE", 2), new Ingredients("LIMEADE", 6), new Ingredients("STRAWBERRY", 6), new Ingredients("LEMONJUICE", 6), new Ingredients("MINT", 4), new Ingredients("POMEGRANATESYRUP", 9), new Ingredients("LEMONSODA", 7), new Ingredients("CHERRYSYRUP", 6), new Ingredients("ROSEMARRYSYRUP", 10), new Ingredients("PINEAPPLEJUICE", 10)};
    private int[] choosedIngredients = new int[5];
    
    public Machine(int money) {
        this.moneyInMachine = money;
    }

    public String showMenu() {
        String mocktailMenu = "------Mocktail Menu------";
        for (int i = 0; i < menu.length; i++) {
            mocktailMenu += "\n" + menu[i];
        }
        return mocktailMenu;
    }

    public void choosemenu() {
        do {
            showMenu();
            System.out.println("Choose menu 1-5\n:");
            customerChoose = input.nextInt();

            if (customerChoose == 1) {
                menuPrice = menu[0].getPrice();
            }
            if (customerChoose == 2) {
                menuPrice = menu[1].getPrice();
            }
            if (customerChoose == 3) {
                menuPrice = menu[2].getPrice();
            }
            if (customerChoose == 4) {
                menuPrice = menu[3].getPrice();
            }
            if (customerChoose == 5) {
                menuPrice = menu[4].getPrice();
            } else {
                System.out.println("Plese choose 1-5");
            }
        } while (customerChoose > 5 && customerChoose < 0);

    }

    public void calculate() {
        System.out.println("Input money: ");
        customerMoney = input.nextInt();
        int change;
        long timeout = 0;

        if (customerMoney > menuPrice) {
            change = customerMoney - menuPrice;
            if (change > moneyInMachine) {
                System.out.println("we don't have money to change");

            } else {
                customerCount++;
                time = System.currentTimeMillis();
            }
            for (int i = 0; timeout - time > menu[customerChoose].getTimeshake(); i++) {
                System.out.println("\n");
                timeout = System.currentTimeMillis();
            }
            System.out.println("Your menu is :" + menu[customerChoose - 1] + "Change: " + change);
        } else {
            System.out.println("Your money is not enough");
        }
    }

    public String showIngredients() {
        String ingredient = "*-*-*-*-list Ingredient-*-*-*-*";
        for (int i = 0; i < ingredients.length; i++) {
            ingredient += "\n" + ingredients[i];
        }
        return ingredient;

    }

    public void chooseIngredients() {
        
        int count = 0;
        do {
            showIngredients();
            System.out.println("Choose menu 1-5\n:");
            customerChoose = input.nextInt();

            if (customerChoose == 1) {
                totalPrice += ingredients[0].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 1;
                        break;
                    }
                }
                    
            }
            if (customerChoose == 2) {
                totalPrice += ingredients[1].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 2;
                        break;
                    }
                }
            }
            if (customerChoose == 3) {
                totalPrice += ingredients[2].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 3;
                        break;
                    }
                }
            }
            if (customerChoose == 4) {
                totalPrice += ingredients[3].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 4;
                        break;
                    }
                }
            }
            if (customerChoose == 5) {
                totalPrice += ingredients[4].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 5;
                        break;
                    }
                }
            }
            if (customerChoose == 1) {
                totalPrice += ingredients[5].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 6;
                        break;
                    }
                }
            }
            if (customerChoose == 2) {
                totalPrice += ingredients[6].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 7;
                        break;
                    }
                }
            }
            if (customerChoose == 3) {
                totalPrice += ingredients[7].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 8;
                        break;
                    }
                }
            }
            if (customerChoose == 4) {
                totalPrice += ingredients[8].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 9;
                        break;
                    }
                }
            }
            if (customerChoose == 5) {
                totalPrice += ingredients[9].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 10;
                        break;
                    }
                }
            }
            if (customerChoose == 1) {
                totalPrice += ingredients[10].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 11;
                        break;
                    }
                }
            }
            if (customerChoose == 2) {
                totalPrice += ingredients[11].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 12;
                        break;
                    }
                }
            }
            if (customerChoose == 3) {
                totalPrice += ingredients[12].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 13;
                        break;
                    }
                }
            }
            if (customerChoose == 4) {
                totalPrice += ingredients[13].getPrice();
                count++;
                for(int i = 0;i<choosedIngredients.length;i++){
                    if(choosedIngredients[i]==0){
                        choosedIngredients[i] = 14;
                        break;
                    }
                }
            } else {
                System.out.println("Plese choose 1-5");
            }
        } while (count != 5);
        
    }
    public void calculate4CustomMenu() {
        System.out.println("Input money: ");
        customerMoney = input.nextInt();
        int change;
        long timeout = 0;
        long customerChooseTime = 0;
        String ingredientsChoose = "";
        for(int i = 0;i<choosedIngredients.length;i++){
            ingredientsChoose+=ingredients[choosedIngredients[i]];
        }

        if (customerMoney > totalPrice) {
            change = customerMoney - totalPrice;
            if (change > moneyInMachine) {
                System.out.println("we don't have money to change");

            } else {
                customerCount++;
                time = System.currentTimeMillis();
                customerChooseTime = input.nextInt()*1000;
            }
            for (int i = 0; timeout - time > customerChooseTime; i++) {
                System.out.println("\n");
                timeout = System.currentTimeMillis();
            }
            System.out.println("Your menu is :" + ingredientsChoose + "Change: " + change);
        } else {
            System.out.println("Your money is not enough");
        }
    }

}
