package com.erinfan.oo.lenth;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch
public class MileTest {
    @Test
    public void should_be_equals_given_3_Mile_and_3_Mile() throws Exception {
        assertThat(new Mile(3), is(new Mile(3)));
    }

    @Test
    public void should_be_not_equals_given_3Mile_and_4Mile() throws Exception {
        assertFalse(new Mile(3).equals(new Mile(4)));
    }
}
