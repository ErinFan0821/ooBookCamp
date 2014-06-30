package com.erinfan.oo.length;

//1Mile = 1760Yard
//1Yard = 3 Feet
//1Feet = 12 Inch
enum LengthEnumImpl implements LengthEnum {
    INCH(1), FEET(12 * INCH.ratio), YARD(3 * FEET.ratio), MILE(1760 * YARD.ratio);
    private final int ratio;

    LengthEnumImpl(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public String getUnitName() {
        return this.name();
    }

    @Override
    public int getRatio() {
        return this.ratio;
    }
}
