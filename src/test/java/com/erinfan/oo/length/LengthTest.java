package com.erinfan.oo.length;

import org.junit.Test;

import static com.erinfan.oo.length.LenthEnumImpl.*;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch

public class LengthTest {

    @Test
    public void should_be_equals_given_3_Mile_and_3_Mile() throws Exception {
        assertThat(new Length(3, MILE), is(new Length(3, MILE)));
    }

    @Test
    public void should_be_not_equals_given_3Mile_and_4Mile() throws Exception {
        assertFalse(new Length(3, MILE).equals(new Length(4, MILE)));
    }

    @Test
    public void should_be_equals_given_1Mile_1760Yard() throws Exception {
        assertTrue(new Length(1, MILE).equals(new Length(1760, YARD)));
    }

    @Test
    public void should_be_equals_given_1Mile_and_1760Yard() throws Exception {
        assertTrue(new Length(1760, YARD).equals(new Length(1, MILE)));
    }

    @Test
    public void should_be_not_equals_given_1Mile_and_1761Yard() throws Exception {
        assertFalse(new Length(1761, YARD).equals(new Length(1, MILE)));
    }

    @Test
    public void should_be_not_equals_given_2Mile_and_1759Yard() throws Exception {
        assertFalse(new Length(1759, YARD).equals(new Length(1, MILE)));
    }

    @Test
    public void should_be_equals_given_1Feet_and_1Feet() throws Exception {
        assertTrue(new Length(1, FEET).equals(new Length(1, FEET)));
    }

    @Test
    public void should_be_equals_given_5280Feet_and_1Mile() throws Exception {
        assertTrue(new Length(5280,FEET).equals(new Length(1,MILE)));
    }

    @Test
    public void should_be_equals_given_1Mile_and_5280Feet() throws Exception {
        assertTrue(new Length(1,MILE).equals(new Length(5280,FEET)));
    }

    @Test
    public void should_be_equals_given_1Yard_and_3Feet() throws Exception {
        assertTrue(new Length(1,YARD).equals(new Length(3,FEET)));
    }

    @Test
    public void should_be_equals_given_3Feet_and_1Yard() throws Exception {
        assertTrue(new Length(3,FEET).equals(new Length(1,YARD)));
    }

    @Test
    public void should_not_equals_given_4Feet_and_1Yard() throws Exception {
        assertFalse(new Length(4,FEET).equals(new Length(1,YARD)));
    }
      
    @Test
    public void should_be_equals_given_1Inch_and_1Inch() throws Exception {
        assertTrue(new Length(1, INCH).equals(new Length(1, INCH)));
    }

    @Test
    public void should_be_equals_given_1Feet_and_12Inch() throws Exception {
        assertTrue(new Length(1, FEET).equals(new Length(12, INCH)));
    }


    @Test
    public void should_be_equals_given_12Inch_and_1Feet() throws Exception {
        assertTrue(new Length(12, INCH).equals(new Length(1, FEET)));
    }

    @Test
    public void should_be_equals_given_36Inch_and_1Yard() throws Exception {
        assertTrue(new Length(36, INCH).equals(new Length(1, YARD)));
    }



}
