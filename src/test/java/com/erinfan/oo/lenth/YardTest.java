package com.erinfan.oo.lenth;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch
public class YardTest {
    @Test
    public void should_be_equal_given_1Mile_and_1760Yard() throws Exception {
        assertTrue(new Mile(1).equals(new Yard(1760)));
    }
}
