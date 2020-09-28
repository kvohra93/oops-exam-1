/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales.commission;

/**
 *
 * @author kvohr
 */
public class SalesCommision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double reqdComm = 30000;
        double commission,balance;					
        double salesAmt = 0;					
        do {
            balance = commission = 0;	
            salesAmt += 0.01;                                              

            if (salesAmt > 0) {
                commission += balance * 0.08;
            }
            if (salesAmt > 5000) {
                commission += (balance -= balance - 5000) * 0.10;
            }
            if (salesAmt > 10000) {
                commission += (balance = salesAmt - 10000) * 0.12;
            }  
            
        } while (commission < reqdComm);

       
        System.out.printf("Required sales to earn commission of $30,000: " +  String.format("%.2f",salesAmt));
    }
}

