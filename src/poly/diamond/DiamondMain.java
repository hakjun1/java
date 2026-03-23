package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.metdhodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.metdhodCommon();
    }
}
