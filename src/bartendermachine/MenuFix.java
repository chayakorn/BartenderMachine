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
public class MenuFix {
    private String name;
    private int price;
    private long timeshake;
    
    public MenuFix (String name,int price,long timeshake){
        this.name = name;
        this.price = price;
        this.timeshake =timeshake;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public long getTimeshake() {
        return timeshake;
    }

    @Override
    public String toString() {
        return name + " Price: " + price + " Shaketime: "+timeshake/1000+" seconds";
    }
    
    
    
}
