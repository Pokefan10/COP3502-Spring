 //Danielle Laraway
import java.util.Scanner;

    public class Main
    {
        public static void main(String[] args)
        {
            Scanner scnr = new Scanner(System.in);

            int x = 0;                  // keep the while loop going
            int y = 0;                  // goes down line
            int value;                  // used to calculate hex conversion
            long total = 0;            // output number
            int stringX;               // string with 0x

            System.out.println("Enter a hexadecimal number: ");
            String userInput = scnr.nextLine();        // userInput
            int length = userInput.length();          // number of characters in input
            int placement;                           // nth power

            stringX = userInput.indexOf("0x");
            if (stringX == -1) {
                userInput = userInput;
            }
            else {
                userInput = userInput.substring(2, userInput.length());
                length = userInput.length();
            }

            while (x < length) {

                    char charExtract = userInput.charAt(y);   // charExtract: character extracted
                    // changes position of each character

                    charExtract = Character.toUpperCase(charExtract);
                    placement = Math.abs(y - length + 1);


                    if (charExtract == 'A') {
                        value = 10;
                    } else if (charExtract == 'B') {
                        value = 11;
                    } else if (charExtract == 'C') {
                        value = 12;
                    } else if (charExtract == 'D') {
                        value = 13;
                    } else if (charExtract == 'E') {
                        value = 14;
                    } else if (charExtract == 'F') {
                        value = 15;
                    } else {
                        value = Character.getNumericValue (charExtract); //https://stackoverflow.com/questions/19388037/converting-characters-to-integers-in-java
                    }

                    total = value * (long)(Math.pow(16, placement)) + total;
                    y++;
                    x++;
                }
            System.out.println("Your number is " + total + " in decimal");

        }
 }


