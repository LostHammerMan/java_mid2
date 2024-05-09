package sec2;

import sec1.ex1.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    
    private T animal;
    
    public void checkup(){
        System.out.println("둥물 이름 = " + animal.getName());
        System.out.println("둥물 크기 = " + animal.getSize());
        animal.sound();
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getBigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
