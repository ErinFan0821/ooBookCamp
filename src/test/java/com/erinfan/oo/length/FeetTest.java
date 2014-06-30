package com.erinfan.oo.length;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch
public class FeetTest {
    @Test
    public void should_be_equals_given_1Feet_and_1Feet() throws Exception {
        assertTrue(new Feet(1,1).equals(new Feet(1,1)));
    }

    @Test
    public void should_be_equals_given_3Feet_and_1Yard() throws Exception {
        assertTrue(new Feet(3,1).equals(new Yard(1,3)));
    }

    @Test
    public void should_be_equals_given_5280Feet_and_1Mile() throws Exception {
        assertTrue(new Feet(5280,1).equals(new Mile(1,5280)));
    }
}
