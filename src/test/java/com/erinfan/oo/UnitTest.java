package com.erinfan.oo;

import org.junit.Test;

import static com.erinfan.oo.length.LengthUnitDefined.*;
import static com.erinfan.oo.length.LengthUnitDefined.INCH;
import static com.erinfan.oo.volume.VolumeUnitDefined.OZ;
import static com.erinfan.oo.volume.VolumeUnitDefined.TBSP;
import static com.erinfan.oo.volume.VolumeUnitDefined.TSP;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UnitTest {
    @Test
    public void should_be_equals_given_1Length_and_1Length() throws Exception {
        assertTrue(new Unit(1, MILE).equals(new Unit(1, MILE)));
        assertTrue(new Unit(1, YARD).equals(new Unit(1, YARD)));
        assertTrue(new Unit(1, FEET).equals(new Unit(1, FEET)));
        assertTrue(new Unit(1, INCH).equals(new Unit(1, INCH)));

        assertTrue(new Unit(1, TSP).equals(new Unit(1, TSP)));
        assertTrue(new Unit(1, TBSP).equals(new Unit(1, TBSP)));
        assertTrue(new Unit(1, OZ).equals(new Unit(1, OZ)));
    }

    @Test
    public void should_be_equals_for_given_right_ratio() throws Exception {
        assertTrue(new Unit(1, MILE).equals(new Unit(1760, YARD)));
        assertTrue(new Unit(1760, YARD).equals(new Unit(1, MILE)));

        assertTrue(new Unit(1, YARD).equals(new Unit(3, FEET)));
        assertTrue(new Unit(3, FEET).equals(new Unit(1, YARD)));

        assertTrue(new Unit(1, FEET).equals(new Unit(12, INCH)));
        assertTrue(new Unit(12, INCH).equals(new Unit(1, FEET)));

        assertTrue(new Unit(1, TBSP).equals(new Unit(3, TSP)));
        assertTrue(new Unit(3, TSP).equals(new Unit(1, TBSP)));

        assertTrue(new Unit(1, OZ).equals(new Unit(2, TBSP)));
        assertTrue(new Unit(2, TBSP).equals(new Unit(1, OZ)));
    }

    @Test
    public void should_be_not_equals() throws Exception {
        assertFalse(new Unit(3, MILE).equals(new Unit(4, MILE)));
        assertFalse(new Unit(1761, YARD).equals(new Unit(1, MILE)));

        assertFalse(new Unit(3,YARD).equals(new Unit(4,YARD)));
        assertFalse(new Unit(4,FEET).equals(new Unit(1,YARD)));

        assertFalse(new Unit(3,FEET).equals(new Unit(4,FEET)));
        assertFalse(new Unit(13,INCH).equals(new Unit(1,FEET)));

        assertFalse(new Unit(1, TBSP).equals(new Unit(4, TSP)));
        assertFalse(new Unit(1, OZ).equals(new Unit(3, TBSP)));
        assertFalse(new Unit(2, OZ).equals(new Unit(7, TBSP)));
    }

    @Test
    public void should_be_2Inch_for_1Inch_add_1Inch() throws Exception {
        assertThat(new Unit(1, INCH).add(new Unit(1, INCH)), is(new Unit(2, INCH).getLength()));
    }

    @Test
    public void should_be_13Inch_for_1Inch_add_1Feet() throws Exception {
        assertThat(new Unit(1, INCH).add(new Unit(1, FEET)), is(new Unit(13, INCH).getLength()));
    }

    @Test
    public void should_be_37Inch_for_1Inch_add_1Yard() throws Exception {
        assertThat(new Unit(1, INCH).add(new Unit(1, YARD)), is(new Unit(37, INCH).getLength()));
    }

    @Test
    public void should_be_63396Inch_for_1Mile_add_1Yard() throws Exception {
        assertThat(new Unit(1, MILE).add(new Unit(1, YARD)), is(new Unit(63396, INCH).getLength()));
    }

    @Test
    public void should_be_2TSP_for_1TSP_add_1TSP() throws Exception {
        assertThat(new Unit(1, TSP).add(new Unit(1, TSP)), is(new Unit(2, TSP).getLength()));
    }

    @Test
    public void should_be_4TSP_for_1TSP_add_1TBSP() throws Exception {
        assertThat(new Unit(1, TSP).add(new Unit(1, TBSP)), is(new Unit(4, TSP).getLength()));
    }

    @Test
    public void should_be_9TSP_for_1OZ_add_1TBSP() throws Exception {
        assertThat(new Unit(1, OZ).add(new Unit(1, TBSP)), is(new Unit(9, TSP).getLength()));
    }
}
