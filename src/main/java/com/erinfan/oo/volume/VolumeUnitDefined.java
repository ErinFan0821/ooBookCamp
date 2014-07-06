package com.erinfan.oo.volume;

import com.erinfan.oo.UnitDefined;

// 1 TBSP = 3 TSP
// 1 OZ = 2 TBSP
public enum VolumeUnitDefined implements UnitDefined {
    TSP(1), TBSP(3 * TSP.ratio), OZ(2 * TBSP.ratio);
    private int ratio;

    VolumeUnitDefined(int ratio) {
        this.ratio = ratio;
    }

    @Override
    public int getRatio() {
        return ratio;
    }
}
