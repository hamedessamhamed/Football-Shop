
package com.mycompany.invoice;

public class Customer {
    private String custName;
    private int numOfitems=1;
    private double totalPay=0;
    private FootballShop[] itemList = new FootballShop[20];

    public Customer(String custName) {
        this.custName = custName;
    }

    public int getNumOfitems() {
        return numOfitems;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public String getCustName() {
        return custName;
    }
    public void buy(FootballShop product){
        itemList[numOfitems]=product;
        System.out.println("Item "+ numOfitems++ );
        product.display();
        totalPay+=product.calcPrice();
    }
    @Override
    public String toString(){
        return "Welcome " +getCustName()+"\nList of Football Items Bought\n ";
    
    }
    public void print(){
        System.out.println("TOTAL : $"+getTotalPay());
    }
    
    
    
}
