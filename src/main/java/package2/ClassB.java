package package2;

import package1.ClassA;

public class ClassB {
    public void methodB() {
        System.out.println("Método da ClassB");
        ClassA a = new ClassA();
        a.methodA();
    }
}