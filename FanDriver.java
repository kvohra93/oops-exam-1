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
public class FanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //creating fan object which is turned on
        Fan f1 = new Fan();
        f1.setSpeed(1);
        f1.setOn(true);
        f1.setRadius(5);
        f1.setColor("brown");
        
        //Creating fan object which is turned off
        Fan f2 = new Fan();
        f1.setOn(false);
        f1.setRadius(4.5);
        f1.setColor("White");
        
        System.out.println(f1.toString());
        System.out.println("---------------------");
        System.out.println(f2.toString());
        
    }
    
}
