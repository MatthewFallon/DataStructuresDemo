package io.fallon.Chapter2;

import io.fallon.Chapter1.BagInterface;

import java.lang.reflect.Array;

/**
 * An Implementation of the BagInterface from chapter one using a fixed size array.
 * @author Matthew Fallon
 * @since 6/15/20
 * @chapter 2
 */
public class ArrayBag<T> implements BagInterface<T> {


    private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;

    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int desiredCapacity) {
        @SuppressWarnings("unchecked")
        T[] newBag = (T[]) new Object[desiredCapacity];
        bag = newBag;
        numberOfEntries = 0;
    }

    /**
     * Gets the current number of entries in this bag.
     *
     * @return The integer number of entries currently in the bag.
     */
    @Override
    public int getCurrentSize() {
        return 0;
    }

    /**
     * Checks whether the current bag is empty.
     *
     * @return A boolean of whether the bag is empty.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Adds the given object T to the bag.
     *
     * @param newEntry The new object to be added to the bag.
     * @return Boolean of if the operation was successful.
     */
    @Override
    public boolean add(T newEntry) {
        if (this.isArrayFull()) {
            return false;
        } else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
    }

    /**
     * Empties the bag of all entries.
     */
    @Override
    public void clear() {

    }

    /**
     * Removes an unspecified entry from the bag and returns it.
     *
     * @return The entry T removed from the bag.
     */
    @Override
    public T remove() {
        return null;
    }

    /**
     * Attempts to remove one copy of the specified entry from the bag and returns true if successful.
     *
     * @param anEntry The entry T to be removed.
     * @return True if the entry T was found and removed.
     */
    @Override
    public boolean remove(T anEntry) {
        return false;
    }

    /**
     * Returns the number of times a given entry T appears in the bag.
     *
     * @param anEntry Entry T to search for in Bag.
     * @return Integer number of times the entry T appears in the bag.
     */
    @Override
    public int getFrequencyOf(T anEntry) {
        return 0;
    }

    /**
     * Checks if a given entry T is contained in the bag.
     *
     * @param anEntry An entry T to search for.
     * @return True if entry T is contained in bag, else false.
     */
    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    /**
     * Returns an array of entries T that are the contents of the bag.
     *
     * @return T array of entries in Bag.
     */
    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            result[i] = bag[i];
        } // end for
        return result;
    } // end toArray

    /**
     * Returns true if ArrayBag is full, else false.
     * @return Boolean of if ArrayBag is full.
     */
    private boolean isArrayFull() {
        return numberOfEntries == bag.length;
    } // end isArrayFull
}
