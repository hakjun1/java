package poly.car1;

public class Driver {

    private Car car;//다른거모르고 자동차역할만 이해

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: "+ car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
