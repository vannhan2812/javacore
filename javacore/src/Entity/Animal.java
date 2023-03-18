package Entity;

public abstract class Animal implements Moving {
    protected int age;
    public abstract void makeNoise();
    public void getAge(){
        System.out.println("I am "+age);
    }

    @Override
    public void movingOn() {

    }
}
