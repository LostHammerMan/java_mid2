package sec2.test;

import sec2.test.unit.BioUnit;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T t1, T t2){
        return t1.getHp() > t2.getHp() ? t1 : t2;
    }
}
