package com.erinfan.oo.length;

import org.junit.Test;

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
        assertThat(new Mile(3, 1760), is(new Mile(3, 1760)));
    }

    @Test
    public void should_be_not_equals_given_3Mile_and_4Mile() throws Exception {
        assertFalse(new Mile(3, 1760).equals(new Mile(4, 1760)));
    }

    @Test
    public void should_be_equals_given_1Mile_1760Yard() throws Exception {
        assertTrue(new Mile(1, 1760).equals(new Yard(1760, 1)));
    }

    @Test
    public void should_be_equals_given_1Mile_and_1760Yard() throws Exception {
        assertTrue(new Yard(1760, 1).equals(new Mile(1, 1760)));
    }

    @Test
    public void should_be_not_equals_given_1Mile_and_1761Yard() throws Exception {
        assertFalse(new Yard(1761, 1).equals(new Mile(1, 1760)));
    }

    @Test
    public void should_be_not_equals_given_2Mile_and_1759Yard() throws Exception {
        assertFalse(new Yard(1759, 1).equals(new Mile(1, 1760)));
    }

    @Test
    public void should_be_equals_given_1Feet_and_1Feet() throws Exception {
        assertTrue(new Feet(1, 1).equals(new Feet(1, 1)));
    }

    @Test
    public void should_be_equals_given_5280Feet_and_1Mile() throws Exception {
        assertTrue(new Feet(5280,1).equals(new Mile(1,5280)));
    }

    @Test
    public void should_be_equals_given_1Mile_and_5280Feet() throws Exception {
        assertTrue(new Mile(1,5280).equals(new Feet(5280,1)));
    }

    @Test
    public void should_be_equals_given_1Yard_and_3Feet() throws Exception {
        assertTrue(new Yard(1,3).equals(new Feet(3,1)));
    }

    @Test
    public void should_be_equals_given_3Feet_and_1Yard() throws Exception {
        assertTrue(new Feet(3,1).equals(new Yard(1,3)));
    }

    @Test
    public void should_not_equals_given_4Feet_and_1Yard() throws Exception {
        assertFalse(new Feet(4,1).equals(new Yard(1,3)));
    }
      
    @Test
    public void should_be_equals_given_1Inch_and_1Inch() throws Exception {
        assertTrue(new Inch(1, 1).equals(new Inch(1, 1)));
    }

    @Test
    public void should_be_equals_given_1Feet_and_12Inch() throws Exception {
        assertTrue(new Feet(1, 12).equals(new Inch(12, 1)));
    }


    @Test
    public void should_be_equals_given_12Inch_and_1Feet() throws Exception {
        assertTrue(new Inch(12, 1).equals(new Feet(1, 12)));
    }

    @Test
    public void should_be_equals_given_36Inch_and_1Yard() throws Exception {
        assertTrue(new Inch(36, 1).equals(new Yard(1, 36)));
    }



}
