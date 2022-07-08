/*
 * This programme  iterates in multiples of A until X, then in multiples of 
 * A + 1 until 2X, then multiples of A + 2 until 3X.
 */
package pkgFindMultiples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Jose Bejarano Escano
 * @date 07/06/2022
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        // Display a panel where to input the first multiplier
        int A = Integer.parseInt( JOptionPane.showInputDialog(null,
            "Input the first multiplier"));
        /* Following the instructions, the program should find multiples of
        the two following numbers */
        int B = A + 2;
        int upperLimit = Integer.parseInt( JOptionPane.showInputDialog(null,
            "Input the first limit")); // First upper limit in the loop
        int limit = upperLimit; // Movable limit
        
        // It will loop three times from the first multiplier
        for(int j = A; j <= B; j++) {
            List<Integer> multiples = new ArrayList<>(); // Store the multiples
            // Loop up to the limit
            for(int i = 0; i <= limit; i++) {
                // Check if the number is multiple of the multiplier
                if(i % A == 0) {
                    multiples.add(i); // Add multiple to the list
                }
            }
            /* Interface to display the multiples.
            HTML is used to control the size of the Panel.
            */
            JOptionPane.showMessageDialog(null,
            "Multiples of " +j +" until " +limit +"\n"
                    + "----------------------------------------\n"
                    +"<html><body><p style='width: 200px;'>"
                    + multiples.toString()
                    +"</p></body></html>");
            limit = limit + upperLimit; // Add the original limit to the movable limit
        }
    }
    
}
