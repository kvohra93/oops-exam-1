/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package georgiancal;

/**
 *
 * @author kvohr
 */
import java.util.GregorianCalendar;
public class GeorgianCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.print("current year: " + cal.get(GregorianCalendar.YEAR) + " current month: " + cal.get(GregorianCalendar.MONTH) + " current day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
        cal.setTimeInMillis(1234567898765L);
        
        System.out.println("\nDate if given time has elapsed is\nDAY:" + cal.get(GregorianCalendar.DAY_OF_MONTH) + " MONTH: " + cal.get(GregorianCalendar.MONTH) + " YEAR: " + cal.get(GregorianCalendar.YEAR));
    }
    
}
