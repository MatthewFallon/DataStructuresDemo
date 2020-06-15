package io.fallon;

import io.fallon.prelude.Circle;
import io.fallon.prelude.Circular;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 * @author Matthew Fallon
 * @since 6/15/2020
 */
public class AppTest 
{

    /**
     * Tests each method in circle and circular interface.
     * @since 6/15/2020
     * @chapter Prelude
     * @exercise 2
     */
    @Test
    public void testCircle() {
        Circular circular = new Circle();
        Circle circle = new Circle();
        circular.setRadius(1);
        assertEquals(1, circular.getRadius(), 0.0);
        circle.setRadius(2);
        assertEquals(2, circle.getRadius(), 0.0);
        assertEquals(Math.PI * 4, circle.getArea(), 0.0);
    }
}
