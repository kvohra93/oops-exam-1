
package area.of.pentagon;

import java.util.Scanner;

/**
 *
 * @author kvohr
 */
public class AreaOfPentagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex(r): ");
        double r = scanner.nextDouble();        
        scanner.close();    
        double side = (2*r*(Math.sin(PI/5)));
        double area = ((5*Math.pow(side,2)/(4*Math.tan(PI/5))));
        System.out.println("The area of pentagon is: " + String.format("%.2f",area));
        scanner.close();
        
        
    }
    
}
