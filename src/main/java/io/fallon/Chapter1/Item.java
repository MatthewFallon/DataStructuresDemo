package io.fallon.Chapter1;

/**
 * Class describing an object that can be bought.
 * @author Matthew Fallon
 * @since 6/15/20
 * @chapter 1
 */
public class Item {

    private final String name;
    private final int price;

    /**
     * Main constructor
     * @param name  Set the name of Item
     * @param price Set the price of Item
     */
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns price of a given Item.
     * @return  Integer price of Item.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Returns name of a given Item.
     * @return  String name of the item.
     */
    public String getName() {
        return name;
    }

}
