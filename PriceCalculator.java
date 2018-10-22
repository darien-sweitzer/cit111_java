

package Chunk2Methods;

import java.util.Scanner;

public class PriceCalculator {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter price of object:\n");
        double price = userInput.nextDouble();
        System.out.println("\nPrice: $" + price);
        displayPriceWithTax(price);
        double discount = 0.15;
        computPriceAfterDiscount(price, discount);
        System.out.println("\nEnter Spending Limit:\n");
        int limit = userInput.nextInt();
        displayPurchaseableNumber(price, limit);
        
    } // close main
    
    public static void displayPriceWithTax(double price) {
        
        final double taxRate = 0.075;
        double totalPrice = price * (1 + taxRate);
        System.out.println("\nTotal price with tax: $" + totalPrice);
        
    } // close PriceWithTax
    
    public static void computPriceAfterDiscount(double price, double discount) {
        
        double finalPrice = price - (price * discount);
        System.out.println("\nPrice after discount: $" + finalPrice);
        
    } // close PriceAfterDiscount
    
    public static void displayPurchaseableNumber(double price, double limit) {
        
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("\nWith $" + limit + ", you can buy " + numPurchasable + " units.");
        
    } // close PurchasableNumber
    
} // close class
