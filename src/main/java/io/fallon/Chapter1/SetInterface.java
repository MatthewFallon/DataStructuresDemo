package io.fallon.Chapter1;

/**
 * An interface describing the operations on a set of objects, without duplicates.
 * @author Matthew Fallon
 * @since 6/15/20
 * @chapter 1
 */
public interface SetInterface<T> {

    /**
     * Gets the current number of entries in this bag.
     * @return  The integer number of entries currently in the bag.
     */
    public int getCurrentSize();

    /**
     * Checks whether the current bag is empty.
     * @return  A boolean of whether the bag is empty.
     */
    public boolean isEmpty();

    /**
     * Adds the given object T to the bag, avoiding duplicates.
     * @param newEntry  The new object to be added to the bag.
     * @return  Boolean of if the operation was successful, false if already in the set.
     */
    public boolean add(T newEntry);

    /**
     * Empties the bag of all entries.
     */
    public void clear();

    /**
     * Removes an unspecified entry from the bag and returns it.
     * @return  The entry T removed from the bag.
     */
    public T remove();

    /**
     * Attempts to remove the specified entry from the bag and returns true if successful.
     * @param anEntry   The entry T to be removed.
     * @return  True if the entry T was found and removed.
     */
    public boolean remove(T anEntry);

    /**
     * Checks if a given entry T is contained in the bag.
     * @param anEntry   An entry T to search for.
     * @return  True if entry T is contained in bag, else false.
     */
    public boolean contains(T anEntry);

    /**
     * Returns an array of entries T that are the contents of the bag.
     * @return  T array of entries in Bag.
     */
    public T[] toArray();
}
