package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    static <T extends BioUnit> void printV1  (Shuttle<T> t) { // Shuttle 제네릭 클래스의 타입을 BioUnit으로 제한
        T unit = t.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
    static void printV2 (Shuttle<? extends BioUnit> t) { // Shuttle 제네릭 클래스의 타입을 BioUnit으로 제한
        BioUnit unit = t.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
