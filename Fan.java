/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fan;

/**
 *
 * @author Kunal Vohra
 */
public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
     
    /**
     * No Argument constructor of class Fan
     */
    public Fan(){
    
    }
    
    //Mutator methods of class Fan
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
   
    
    //accessor methods of class Fan
    public int getSpeed(){
        return speed;
        }
    
    public boolean getOn(){
        return on;
        }
    
    public String getColor(){
        return color;
        }
    
    public double getRadius(){
        return radius;
        }
    
    /**
     * Returns a string describing the fan object
     * @return String value of fan object properties
     */
    @Override
    public String toString(){
        String status;
        // Using if else to show different string if fan is on or off
        if (this.on = true){
            status = ("The fan speed is: " + this.speed + "\nThe fan is of " + this.color + " color" + "\nThe radius of the fan is " + this.radius);
        }
        else {
        
            status = ("The fan is of " + this.color + "\nThe radius of the fan is " + this.radius + "\nThe fan is off");
        }
    return status;
    }  
}

