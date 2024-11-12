package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> intergerBox = new GenericBox<Integer>(); // 생성 시점에 T 의 타입을 결정
        intergerBox.set(10);
//        intergerBox.set("문자100"); // Interger 타입만 허용, 컴파일 오류
        Integer integer = intergerBox.get(); // Interger 타입 반환 (캐스팅 x)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("String = " + str);

        //원하는 모든 타입을 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("Double = " + doubleValue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Boolean> integerBox2 = new GenericBox<>();
    }
}
