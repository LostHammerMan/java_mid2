package sec2;

import sec1.ex1.animal.Cat;
import sec1.ex1.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogAnimalHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catAnimalHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍", 100);
        Cat cat = new Cat("야옹이", 300);

        dogAnimalHospital.setAnimal(dog);
        Dog biggerDog = dogAnimalHospital.getBigger(new Dog("멍멍2", 200));

        System.out.println("biggerDog = " + biggerDog);
    }
}
