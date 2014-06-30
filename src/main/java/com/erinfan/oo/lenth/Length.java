package com.erinfan.oo.lenth;

/**
 * Created by techops on 6/30/14.
 */
public class Length {
    protected final int length;

    public Length(int i) {
        this.length = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (Yard.class == o.getClass()) {
            Yard yard = (Yard) o;
            if (length * 1760 != yard.getLength()) {
                return false;
            }
        } else if (getClass() == o.getClass()) {

            Mile mile = (Mile) o;

            if (length != mile.length) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return length;
    }

    public int getLength() {
        return length;
    }
}
