package package3;

import package2.ClassB;

public class ClassC {
    public void methodC() {
        System.out.println("Método da ClassC");
        ClassB b = new ClassB();
        b.methodB();
    }
}
