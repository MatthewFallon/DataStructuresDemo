package io.fallon.prelude;

/**
 * An interface describing a class of names.
 * @chapter Prelude
 * @exercise 1
 * @author Matthew Fallon
 * @since 6/14/2020
 */
public interface NameInterface {

    /**
     * Sets the first and last name of the class.
     * @param firstName A string that is the desired first name.
     * @param lastName A string that is the desired last name.
     */
    public void setName(String firstName, String lastName);

    /**
     * Gets the full name of the class.
     * @return  A string containing the first and last names. Delimited by a space.
     */
    public String getName();

    /**
     * Sets the first name of the class.
     * @param firstName The name to be set as first name.
     */
    public void setFirst(String firstName);

    /**
     * Returns the first name of the class.
     * @return  A string containing the first name.
     */
    public String getFirst();

    /**
     * Sets the last name of the class.
     * @param lastName The name to be set as last name.
     */
    public void setLast(String lastName);

    /**
     * Returns the last name of the class.
     * @return  A string containing the last name.
     */
    public String getLast();

    /**
     * Sets the last name of this class to the last name of the input class.
     * @param aName The name with a last name to be passed on.
     */
    public void giveLastNameTo(NameInterface aName);

    /**
     * Returns a string of the full name of the class.
     * @return  A string containing the full name.
     */
    public String toString();
} // end NameInterface
