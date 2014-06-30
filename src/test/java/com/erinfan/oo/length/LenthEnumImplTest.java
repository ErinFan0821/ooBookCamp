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
        assertThat(LenthEnumImpl.INCH.getUnitName(), is("INCH"));
        assertThat(LenthEnumImpl.FEET.getUnitName(), is("FEET"));
        assertThat(LenthEnumImpl.YARD.getUnitName(), is("YARD"));
        assertThat(LenthEnumImpl.MILE.getUnitName(), is("MILE"));
    }

    @Test
    public void should_return_correct_ratio() throws Exception {
        assertThat(LenthEnumImpl.INCH.getRatio(), is(1));
        assertThat(LenthEnumImpl.FEET.getRatio(), is(12));
        assertThat(LenthEnumImpl.YARD.getRatio(), is(36));
        assertThat(LenthEnumImpl.MILE.getRatio(), is(63360));
    }
}
