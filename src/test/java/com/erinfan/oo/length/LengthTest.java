package com.erinfan.oo.length;

import org.junit.Test;

import static com.erinfan.oo.length.LengthEnumImpl.*;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch

public class LengthTest {

    @Test
    public void should_be_equals_given_1Lenth_and_1Lenth() throws Exception {
        assertTrue(new Length(1, MILE).equals(new Length(1, MILE)));
        assertTrue(new Length(1, YARD).equals(new Length(1, YARD)));
        assertTrue(new Length(1, FEET).equals(new Length(1, FEET)));
        assertTrue(new Length(1, INCH).equals(new Length(1, INCH)));
    }

    @Test
    public void should_be_equals_for_given_right_ratio() throws Exception {
        assertTrue(new Length(1, MILE).equals(new Length(1760, YARD)));
        assertTrue(new Length(1760, YARD).equals(new Length(1, MILE)));

        assertTrue(new Length(1, YARD).equals(new Length(3, FEET)));
        assertTrue(new Length(3, FEET).equals(new Length(1, YARD)));

        assertTrue(new Length(1, FEET).equals(new Length(12, INCH)));
        assertTrue(new Length(12, INCH).equals(new Length(1, YARD)));
    }

    @Test
    public void should_be_not_equals() throws Exception {
        assertFalse(new Length(3, MILE).equals(new Length(4, MILE)));
        assertFalse(new Length(1761, YARD).equals(new Length(1, MILE)));

        assertFalse(new Length(3,YARD).equals(new Length(4,YARD)));
        assertFalse(new Length(4,FEET).equals(new Length(1,YARD)));

        assertFalse(new Length(3,FEET).equals(new Length(4,FEET)));
        assertFalse(new Length(13,INCH).equals(new Length(1,FEET)));
    }
}
