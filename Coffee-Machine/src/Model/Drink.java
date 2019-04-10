/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Mostafa
 */
public class Drink {
   
    private static ArrayList<Drink> allDrinks = new ArrayList<Drink>();
    
    String name;
    int coffee;
    int milk;
    int chocolate;
    private Drink(String name, int coffee,int milk , int chocolate){
        this.name = name;
        this.coffee = coffee;
        this.milk = milk;
        this.chocolate=  chocolate;
        
    }

    public int getCoffee() {
        return coffee;
    }

    public int getMilk() {
        return milk;
    }

    public int getChocolate() {
        return chocolate;
    }
    
    
    private static  void initializeDrinks(){
        Drink espresso = new Drink("espresso",2,4,5);
        Drink mocha = new Drink("mocha",2,1,1);
        Drink latte = new Drink("latte",2,1,1);
        Drink machiatto = new Drink("machiatto",2,1,1);
        Drink mochaccino = new Drink("mochaccino",2,1,1);
        Drink cappuccino = new Drink("cappuccino",2,1,1);
        allDrinks.add(espresso);
        allDrinks.add(mocha);
        allDrinks.add(latte);
        allDrinks.add(machiatto);
        allDrinks.add(mochaccino);
        allDrinks.add(cappuccino);
    }
    public static  ArrayList<Drink> getDrinks()
    {
        if (allDrinks.size() > 0)
            return allDrinks;
        else {
          
            initializeDrinks();
            
            return allDrinks;
            
        }
    }
   
            
}