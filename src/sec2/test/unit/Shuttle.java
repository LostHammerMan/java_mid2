package sec2.test.unit;

public class Shuttle<T extends BioUnit> {

//    private String name;
//    private int hp;

    private T unit;

    public void in(T t){
//        this.name = t.getName();
//        this.hp = t.getHp();
        unit = t;
    }

    public T out(){
        return unit;
    }

    public void showInfo(){
        System.out.println("이름 : " + unit.getName() + ", HP :" + unit.getHp());
    }
}
