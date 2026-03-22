package extends1.overriding;

public class ElectricCar extends Car {//자식에서부모를 ElectricCar -> Car

    @Override//이거 주석처리해도 된다. 하지만 쓴다.
    public void move() {//상속받은 메서드를 재정의 메서드 오버라이딩
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
