
package com.mycompany.invoice;

public class Boots extends FootballShop implements DiscConsiderable{
    private int size;
    public Boots() {}

    public Boots(String brand, double price, int quantity ,int size) {
        super(brand, price, quantity);
        this.size=size;
    }
    @Override
    public double calcDisc(){
        return (0.17*getPrice()*getQuantity());         
    }      
    @Override
    public void display(){
        System.out.println("SOCCER BOOTS");
        System.out.println("Brand : "+getBrand());
        System.out.println("Price : $"+getPrice()+" for size "+ size);
        System.out.println("Discount : 17.0%");
        System.out.println("Quantity : "+getQuantity());
        System.out.println("Subtotal : $"+calcPrice()+"\n");
    }
       
    @Override
    public double calcPrice(){
        return (getPrice()*getQuantity() - calcDisc());
    }
    
}
