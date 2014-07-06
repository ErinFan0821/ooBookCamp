package com.erinfan.oo;


public class Unit {
    private final int length;
    private final UnitDefined unitDefined;


    public Unit(int length, UnitDefined unitDefined) {
        this.length = length;
        this.unitDefined = unitDefined;
    }

    private int toBaseLength() {
        return unitDefined.getRatio() * length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Unit)) return false;
        Unit unit = (Unit) o;
        return toBaseLength() == unit.toBaseLength();
    }

    public int getLength() {
        return length;
    }

    public int add(Unit length) {
        return toBaseLength() + length.toBaseLength();
    }
}
