package com.erinfan.oo.length;

public class Length {

    private final int length;
    private final int unit;

    public Length(int length, LenthEnumImpl lenthEnum) {
        this.length = length;
        this.unit = lenthEnum.getRatio();
    }

    @Override
    public int hashCode() {
        return toUnitLength();
    }

    public int toUnitLength() {
        return length * unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Length)) return false;
        Length len = (Length) o;
        return toUnitLength() == len.toUnitLength();
    }
}
