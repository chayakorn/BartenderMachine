/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bartendermachine;

/**
 *
 * @author Chayakorn
 */
public class Ingredients {
    private String name;
    private int price;
    
    public Ingredients(String name,int price){
        this.name = name;
        this.price = price;
        
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " Price : " +price;
    }
    
    
}
