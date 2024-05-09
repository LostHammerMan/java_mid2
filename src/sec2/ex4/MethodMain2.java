package sec2.ex4;

import sec1.ex1.animal.Cat;
import sec1.ex1.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("더 큰 멍멍이", 200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
