package validationcc;

import java.util.Scanner;

public class ValidationCC {

    
    // this method checks if the scanned number is a valid creditcard number or not
    public static boolean isValid(long number) {
          
        
        if(getSize(number) >= 13 && getSize(number) <= 16){                               
            if(prefixMatched(number, 4) || prefixMatched(number, 5)|| prefixMatched(number, 37) || prefixMatched(number, 6)){
                if((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number))% 10 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else {
                return false;
            }
      }    
     else 
        return false;
    }
    //this method calculates the total total of all even place doubled numbers
    public static int sumOfDoubleEvenPlace(long number) {
        int total = 0;
        String sequence = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            total += getDigit(Integer.parseInt(sequence.charAt(i) + "") * 2);
        }

        return total;
    }
    //returns total of two numbers or just the number if it is single
    public static int getDigit(int number) {
        if (number < 9) {
            return number;
        }
        return number / 10 + number % 10;
    }

    //returns the total of all numbers in the odd positions
    public static int sumOfOddPlace(long number) {
        int total = 0;
        String sequence = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            total += Integer.parseInt(sequence.charAt(i) + "");
        }
        return total;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d) {
        String sequence = d + "";
        return sequence.length();
    }

    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String sequence = number + "";
            return Long.parseLong(sequence.substring(0, k));
        }
        return number;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer");
        long number = scanner.nextLong();
        scanner.close();

        if(isValid(number)){
            System.out.println(number + " is valid");
            }
        else{
            System.out.println(number + " is invalid");
        }

    }
}
