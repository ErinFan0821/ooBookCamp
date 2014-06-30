package com.erinfan.oo.length;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch
public class LenthEnumImplTest {
    @Test
    public void should_return_correct_name() throws Exception {
        assertThat(LengthEnumImpl.INCH.getUnitName(), is("INCH"));
        assertThat(LengthEnumImpl.FEET.getUnitName(), is("FEET"));
        assertThat(LengthEnumImpl.YARD.getUnitName(), is("YARD"));
        assertThat(LengthEnumImpl.MILE.getUnitName(), is("MILE"));
    }

    @Test
    public void should_return_correct_ratio() throws Exception {
        assertThat(LengthEnumImpl.INCH.getRatio(), is(1));
        assertThat(LengthEnumImpl.FEET.getRatio(), is(12));
        assertThat(LengthEnumImpl.YARD.getRatio(), is(36));
        assertThat(LengthEnumImpl.MILE.getRatio(), is(63360));
    }
}
