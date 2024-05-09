package sec1.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();

        integerBox.setValue(10);
        Integer integer  = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }

}
