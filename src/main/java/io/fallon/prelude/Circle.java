package io.fallon.prelude;

/**
 * An object to represent a circle and its radius.
 * @since 6/15/2020
 * @author Matthew Fallon
 * @chapter Prelude
 * @exercise 2
 */
public class Circle implements Circular {

    private double radius;

    /**
     * Sets the new radius of the circular object.
     *
     * @param newRadius The new radius to be applied. newRadius greater than 0.
     */
    @Override
    public void setRadius(double newRadius) {
        radius = newRadius;
    } // end setRadius

    /**
     * Returns the radius of the circular object.
     *
     * @return The radius of the object.
     */
    @Override
    public double getRadius() {
        return radius;
    } // end getRadius

    /**
     * Returns the area of the circle.
     * @return  The radius of the circle.
     */
    public double getArea() {
        return Math.PI * radius * radius;
    } // end getArea
}
