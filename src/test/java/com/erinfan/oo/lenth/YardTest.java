package com.erinfan.oo.lenth;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch
public class YardTest {
    @Test
    public void should_be_equals_given_1Mile_and_1760Yard() throws Exception {
        assertTrue(new Yard(1760).equals(new Mile(1)));
        assertTrue(new Mile(1).equals(new Yard(1760)));
    }

    @Test
    public void should_be_not_equals_given_1Mile_and_1761Yard() throws Exception {
        assertFalse(new Yard(1761).equals(new Mile(1)));
    }

    @Test
    public void should_be_not_equals_given_2Mile_and_1759Yard() throws Exception {
        assertFalse(new Yard(1759).equals(new Mile(1)));
    }

}
