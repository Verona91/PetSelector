
// Verona M Gerolmini Bianchimano
// Date: 10/13/25
// Description: This program will ask the user questions and take their input. After that, depending on their responses, the
// program will assign a pet.

import java.util.*;

public class PetSelector{
    public static void main(String [] args){
       
        // Create a Scanner to read user's inputs
        Scanner scan = new Scanner(System.in);

        // Ask the user's favorit color between thre of them and take their input
        System.out.println("Enter your favorite color (Either red, blue or green):");
        String color = scan.nextLine();

        // Ask the user's favorit season and take their input
        System.out.println("Enter your favorite season (winter, spring, summer, fall):");
        String season = scan.nextLine();

        // Ask user their name and take their input
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        // Restore the user's inputs to lower case
        color = color.toLowerCase();
        season = season.toLowerCase();
        
        // All the pet possibilities based on the user's inputs
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0) {
            if (color.equals("blue") && season.equals("fall")) {
                // If like blue and fall: get a Alligator
                System.out.println("Your perfect pet is: Alligator");
            }
            else if (color.equals("blue") && season.equals("spring")) {
                // If like blue and spring: get a Ostrich
                System.out.println("Your perfect pet is: Ostrich");
            }
            else if (color.equals("green") && season.equals("winter") && !("aeiou".indexOf(name.substring(0, 1).toLowerCase()) >= 0)) {
                // If like green and winter, but their name doesn't start by a vowel: get a Giraffe
                System.out.println("Your perfect pet is: Giraffe");
            }
            else if (color.equals("green") && !season.equals("fall")) {
                // If like green and any season but fall: get a Dog
                System.out.println("Your perfect pet is: Dog"); 
            }
            else if (color.equals("red") && season.equals("spring")) {
                // If like red and spring...
                if ("aeiou".indexOf(name.substring(0, 1).toLowerCase()) >= 0) {
                    // ... and their name start by a vowel: get a Porcupine
                    System.out.println("Your perfect pet is: Porcupine");
                }
                else {
                    // ... and their name doesn't start by a vowel: get a Panda
                    System.out.println("Your perfect pet is: Panda");
                }
            }
            else if (season.equals("summer")) {
                // If like summer but the before conditions don't apply: get a Pony
                System.out.println("Your perfect pet is: Pony"); 
            }
            else if (color.equals("blue") && !season.equals("summer") && !season.equals("fall") && !("aeiou".indexOf(name.substring(0, 1).toLowerCase()) >= 0)) {
                // If like blue and any season but summer nor fall and their name doesn't starts by a vowel: get an Axolotl
                System.out.println("Your perfect pet is: Axolotl"); 
            }
            else {
                // If any of the conditions apply: get a Pet rock
                System.out.println("Your perfect pet is: Pet rock");
            }
        }
        else {
            // If there is a number in the first letter of the word, a message appears.
            System.out.println("That is not a word");
        }
    }
}
