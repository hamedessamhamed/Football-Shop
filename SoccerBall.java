
package com.mycompany.invoice;

public class SoccerBall extends FootballShop {
    private int ballType;

    public SoccerBall(){}

    public SoccerBall(String brand, double price, int quantity , int ballType) {
        super(brand, price, quantity);
        this.ballType = ballType;
    }
    
    @Override
     public void display(){
        System.out.println("SOCCER BALL");
        System.out.println("Brand : "+getBrand());
        if( ballType==1){  
            System.out.println("Type : Professional Match");
            setPrice(200);
            System.out.println("Price : $"+getPrice());
            System.out.println("No Discount!");
            System.out.println("Quantity : "+getQuantity());
            System.out.println("Subtotal : $"+calcPrice()+"\n");
        }else if(ballType==2){
            System.out.println("Type : Match");
            setPrice(80);
            System.out.println("Price : $"+getPrice());
            System.out.println("No Discount!");
            System.out.println("Quantity : "+getQuantity());
            System.out.println("Subtotal : $"+calcPrice()+"\n");
        }else if(ballType==3){
            System.out.println("Type : Training");
            setPrice(50);
            System.out.println("Price : $"+getPrice());
            System.out.println("No Discount!");
            System.out.println("Quantity : "+getQuantity());
            System.out.println("Subtotal : $"+calcPrice()+"\n");
        }else if(ballType==4){
            System.out.println("Type : Recreational");
            setPrice(20);
            System.out.println("Price : $"+getPrice());
            System.out.println("No Discount!");
            System.out.println("Quantity : "+getQuantity());
            System.out.println("Subtotal : $"+calcPrice()+"\n");
        }else{
            try {
                throw new NotBallTypeException(ballType+ " Not a valid soccer ball type , changing the ball type to training ball\n");
            } catch (NotBallTypeException e) {
                System.out.println(e.getMessage());
                ballType=3;
                display();
            }   
        }  
     }
       
    @Override
    public double calcPrice(){
        return (getPrice()*getQuantity());
    }
   
    
}
