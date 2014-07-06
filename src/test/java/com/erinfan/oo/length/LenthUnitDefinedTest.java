package com.erinfan.oo.length;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch
public class LenthUnitDefinedTest {
    @Test
    public void should_return_correct_ratio() throws Exception {
        assertThat(LengthUnitDefined.INCH.getRatio(), is(1));
        assertThat(LengthUnitDefined.FEET.getRatio(), is(12));
        assertThat(LengthUnitDefined.YARD.getRatio(), is(36));
        assertThat(LengthUnitDefined.MILE.getRatio(), is(63360));
    }
}
