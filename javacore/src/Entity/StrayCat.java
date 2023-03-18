package Entity;

import Entity.Cat;

public class StrayCat extends Cat {
    public StrayCat(){
        System.out.println("Entity.A Stray Entity.Cat");
    }

    @Override
    public void makeNoise() {
        System.out.println("Entity.A stray cat makes a noise");
    }
}
