/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package p;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author first
 */
public class RentFianl {
    
    public static void main(String[] args) {
        private Tool tool = new Tool();
    String filePath = "src/input_01.txt";
        
         // Create a File object
        File file = new File(filePath);

        // Use try-with-resources to ensure the Scanner is closed properly
        try (Scanner scanner = new Scanner(file)) {
            // Read the file line by line
            System.out.println("running");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Process the line (for example, print it to the console)
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // Handle the case when the file is not found
            e.printStackTrace();
        }
        
    }
}

//
//Explanation
//
//    Tool class: Manages tool properties and operations like adding, renting, returning, discarding, and calculating profits.
//    RentalRecord class: Stores details of individual rentals.
//    ToolRentalSystem class: Reads commands from a file, processes each command, updates the inventory, and computes profit/loss.
//
//Complexity Analysis
//
//    ADD: O(1) - Adding a tool or updating quantity.
//    RENT: O(n) - Where n is the number of rentals for the tool being rented.
//    RETURN: O(n) - Where n is the number of rental records that need to be processed.
//    RETURN_DAMAGED: O(1) - Simple removal and cost calculation.
//    DISCARD: O(1) - Simple removal and cost calculation.
//    CHECK: O(n) - Where n is the number of distinct tools in inventory.
//    PROFIT: O(n) - Where n is the number of rental records.
//
//This code structure ensures that all operations are efficiently managed and that the profit/loss calculation is accurate. Make sure to test the implementation with various input files to validate correctness.
