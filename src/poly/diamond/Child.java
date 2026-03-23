package poly.diamond;

public class Child implements InterfaceA,InterfaceB{//다중구현
    @Override
    public void methodA() {
        System.out.println("Child.methodA");

    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");

    }

    @Override
    public void metdhodCommon() {
        System.out.println("Child.metdhodCommon");

    }
}
