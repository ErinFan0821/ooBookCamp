package com.erinfan.oo.lenth;

/**
 * Created by techops on 6/27/14.
 */
public class Mile {

    private final int lenth;

    public Mile(int i) {
        this.lenth = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mile mile = (Mile) o;

        if (lenth != mile.lenth) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return lenth;
    }
}
