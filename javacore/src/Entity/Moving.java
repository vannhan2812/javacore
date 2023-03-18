package Entity;

import Entity.A;
import Entity.Hunting;

public interface Moving extends Hunting, A {
    private void method(){
        System.out.println("on foot");
    }
    static void method2(){

    }
    void movingOn();
}
