package sec2.ex4;

public class MethodMain1 {
    public static void main(String[] args) {

        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);

        // 타입인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>numberMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

    }
}
