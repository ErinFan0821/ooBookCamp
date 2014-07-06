package com.erinfan.oo.volume;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VolumeUnitDefinedTest {

    @Test
    public void should_return_correct_ratio() throws Exception {
        assertThat(VolumeUnitDefined.TSP.getRatio(), is(1));
        assertThat(VolumeUnitDefined.TBSP.getRatio(), is(3));
        assertThat(VolumeUnitDefined.OZ.getRatio(), is(6));
    }
}
