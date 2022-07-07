/*
 * This programme  iterates in multiples of A until X, then in multiples of 
 * A + 1 until 2X, then multiples of A + 2 until 3X.
 */
package pkg2icodingchallenge;

import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Jose Bejarano Escano
 * @date 07/06/2022
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        int A;
        int upperLimit = 100; // First upper limit in the loop
        int limit = upperLimit; // Movable limit
        
        // It will loop three times from the first multiplier
        for(A = 2; A <= 4; A++) {
            System.out.println("===============================================");
            System.out.println("Multiples of " +A +" until " +limit);
            System.out.println("===============================================");
            
            // Loop up the limit
            for(int i = 0; i <= limit; i++) {
                // Check if the number is multiple of the multiplier
                if(i % A == 0)
                    System.out.println(i);
            }
            
            limit = limit + upperLimit; // Add the original limit to the movable limit
        }
    }
    
}
