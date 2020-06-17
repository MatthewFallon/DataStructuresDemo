package io.fallon;

import io.fallon.Chapter1.BagInterface;
import io.fallon.Chapter1.Item;
import io.fallon.Chapter2.ArrayBag;

/**
 * Main running client for demonstrating the aspects of this project.
 * @author Matthew Fallon
 * @since 6/15/20
 *
 */
public class App 
{


    /**
     * Main running function for the demo programs.
     * @param args arguments taken in to the program from the command line.
     */
    public static void main( String[] args )
    {
    }

    /*
     * Demo of a Bag class and interface.
     * @chapter 1
     */
//    public static void onlineShopper() {
//        Item[] items = {new Item("Seed", 209),
//                        new Item("mask", 6078),
//                        new Item("car", 70899),
//                        new Item("mulch", 4599)};
//        BagInterface<Item> shoppingCart = new <>();
//        int totalCost = 0;
//
//        //simulate adding items
//        for (Item each :
//                items) {
//            shoppingCart.add(each);
//            totalCost += each.getPrice();
//        }
//
//        //simulate checkout
//        while( !shoppingCart.isEmpty() ) {
//            System.out.println(shoppingCart.remove());
//        }
//
//        System.out.println("Total Cost: " + "/t$" + totalCost / 100 + "." + totalCost % 100);
//    }
}
