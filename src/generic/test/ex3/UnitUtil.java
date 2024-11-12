package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T unit1, T untit2) {
        return unit1.getHp() > untit2.getHp() ? unit1 : untit2;
    }
}
