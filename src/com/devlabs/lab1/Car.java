
package com.devlabs.lab1;

public class Car {
	   
    static int tyres = 4; //instance variables - for every instance, there will be a copy of instance variables. //object level

    int price; //object level'
    int speed; 
    //static variables, - I dont need an object, but for instance variables, I need an object to display the value.
    

    public static void main(String[] args)
    {
     Car c = new Car(); //creation of object
     
     c.display("Audi",500000,80); //method call
     System.out.println("No.of tyres in Audi : " + tyres); 
     
     Car c1 = new Car();
     c1.display("BMW",1000000, 50 );

     System.out.println("No.of tyres in BMW: " + tyres); 
    }
    
    //method - functionality
    public void display(String m, int price, int speed) //m=Audi
    {
        String model =m; //local variable
        System.out.println("The model is:" + model);
        System.out.println("The price is:"+ price);
        System.out.println("The speed is:"+ speed);
    }

}
