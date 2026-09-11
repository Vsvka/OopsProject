
package javaprojects;
import java.util.Scanner;



public class Oops {

    public int getInput(int lowerB, int upperB, String prompt, String errorM) {

        Scanner input = new Scanner(System.in);

        while (true) {
            
            System.out.print(prompt);

            if (input.hasNextInt()) {
                int value = input.nextInt();

                
                if (value >= lowerB && value <= upperB) {
                    return value;
                }
                
                System.out.println(errorM);

            } else {

                System.out.println(errorM);
                input.next();
            }

            

        }
    }
}
