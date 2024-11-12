package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("Integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String string = (String) stringBox.get();
        System.out.println("String = " + string);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer resutl = (Integer) integerBox.get(); // String -> Integer로 캐스팅 예외 발생
        System.out.println("Integer = " + resutl);

    }
}
