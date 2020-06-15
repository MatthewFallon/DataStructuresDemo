package io.fallon.prelude;

/**
 * An interface for classes that contain a circular object.
 * @since 6/15/2020
 * @author Matthew Fallon
 * @chapter Prelude
 * @exercise 2
 */
public interface Circular {

    /**
     * Sets the new radius of the circular object.
     * @param newRadius The new radius to be applied. newRadius greater than 0.
     */
    public void setRadius(double newRadius);

    /**
     * Returns the radius of the circular object.
     * @return  The radius of the object.
     */
    public double getRadius();
}
