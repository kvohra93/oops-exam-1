/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.occurrence;

import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author kvohr
 */
public class StringOccurrence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbOfOccurrences = 0;
        System.out.print("Enter String 1:");
        String sentence = scanner.nextLine();
        System.out.print("Enter String 2:");
        String word = scanner.nextLine();
        scanner.close();
        String[] split = sentence.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (word.equalsIgnoreCase(split[i])) {
                numbOfOccurrences++;
            }
        }
        System.out.println("The number of occurences of " + word + " in the above String are " + numbOfOccurrences);
    }

}
