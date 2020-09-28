
import java.util.Scanner;

/**
 *
 * @author Kunal Vohra
 */
public class SSN {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a SSN (DD-DD-DDDD): ");
        
        while (!scan.hasNext("\\d\\d\\d-\\d\\d-\\d\\d\\d\\d")){
            String incorrect = scan.next();
            System.out.print(incorrect + " is an invalid social security number");
        }
        String ssn = scan.next();
        System.out.println(ssn + "is a valid social security number");
        scan.close();
        
        
    }
    
}
