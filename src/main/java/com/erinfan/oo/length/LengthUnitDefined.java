package com.erinfan.oo.length;

import com.erinfan.oo.UnitDefined;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch
public enum LengthUnitDefined implements UnitDefined {
    INCH(1), FEET(12 * INCH.ratio), YARD(3 * FEET.ratio), MILE(1760 * YARD.ratio);
    private final int ratio;

    LengthUnitDefined(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public int getRatio() {
        return this.ratio;
    }
}
