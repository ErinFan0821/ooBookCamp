package com.erinfan.oo.lenth;

/**
 * Created by techops on 6/27/14.
 */
public class Yard {
    private final int length;

    public Yard(int i) {
        this.length = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yard yard = (Yard) o;

        if (length != yard.length) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return length;
    }
}
