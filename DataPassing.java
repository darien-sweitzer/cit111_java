

package Chunk2Methods;

import java.util.Scanner;

public class DataPassing {
    
    Scanner userInput = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        final double price = 100.00;
        System.out.println("Hard-Coded Price: " + price);
        displayPriceWithTax(price);
        double discount = 0.15;
        computPriceAfterDiscount(price, discount);
        
    } // close main
    
    public static void displayPriceWithTax(double price) {
        
        final double taxRate = 0.075;
        double totalPrice = price * (1 + taxRate);
        System.out.println("Total price with tax: $" + totalPrice);
        
    } // close PriceWithTax
    
    public static void computPriceAfterDiscount(double price, double discount) {
        
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
        
    } // close PriceAfterDiscount
    
    public static void displayPurchaseableNumber(double price, double limit) {
        
        int numPurchasable = (int) Math.floor(limit / price);
        System.out.println("With $" + limit + ", you can buy " + numPurchasable + " units.");
        
    } // close PurchasableNumber
    
} // close class
