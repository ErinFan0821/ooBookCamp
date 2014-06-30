package com.erinfan.oo.lenth;

public class Yard {
    private final int length;

    public Yard(int i) {
        this.length = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Mile.class != o.getClass()) return false;

        Mile mile = (Mile) o;

        if (length != mile.getLength() * 1760) return false;

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
