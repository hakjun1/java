package extends1.ex2;

public class ElectricCar extends Car {//자식에서부모를 ElectricCar -> Car
//자식은 상속대상을 알고있다, 부모는 자식에 대해서 모른다.
    public void charge() {
        System.out.println("충전합니다.");
    }
}
