package Entity;

public class Cat extends Animal implements Hunting{
    public static int numberOfLegs;
    static {
        System.out.println("I am static");
    }
    public Cat(){
        System.out.println("Entity.A Entity.Cat");
    }
    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    @Override
    public void getAge() {
        super.getAge();
    }

    @Override
    public void hunting() {

    }
}
