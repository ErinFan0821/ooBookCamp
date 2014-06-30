package com.erinfan.oo.length;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch
public class MileTest {
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
}
