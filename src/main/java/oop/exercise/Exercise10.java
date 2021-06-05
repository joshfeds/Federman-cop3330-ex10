package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise10
{
    static Scanner input = new Scanner(System.in);
    static final float TAX_RATE = .055F;
    public static String priceItem(int itemNumber){
        System.out.printf("Enter the price of item %d ", itemNumber + 1);
        return input.nextLine();
    }
    public static String quantityItem(int itemNumber){
        System.out.printf("Enter the quantity of item %d ", itemNumber + 1);
        return input.nextLine();
    }
    public static void printMath(float subTotal, float tax, float total){
        System.out.printf("Subtotal: $%.2f\n", subTotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f", total);
    }
    public static void doMath(Integer [] itemPriceNum, Integer [] itemQuantityNum) {
        float subTotal = 0;

        for(int i = 0; i < 3; i++)
        {
            subTotal += itemPriceNum[i] * itemQuantityNum[i];
        }
        float tax = TAX_RATE * subTotal;
        float total = tax + subTotal;
        printMath(subTotal, tax, total);
    }
    public static void main( String[] args) {
        String[] itemPrice = new String[3];
        String[] itemQuantity = new String[3];
        Integer[] itemPriceNum = new Integer[3];
        Integer[] itemQuantityNum = new Integer[3];

        for(int i = 0; i < 3; i++)
        {
            itemPrice[i] = priceItem(i);
            itemQuantity[i] = quantityItem(i);
        }
        for(int i = 0; i < 3; i++)
        {
            itemPriceNum[i] = Integer.parseInt(itemPrice[i]);
            itemQuantityNum[i] = Integer.parseInt(itemQuantity[i]);
        }
        doMath(itemPriceNum, itemQuantityNum);

    }
}
