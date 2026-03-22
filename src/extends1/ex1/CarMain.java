package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();// 공통된 기능 move , 다른기능 충전 이럴때 사용하는게 상속
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();//
        gasCar.fillup();
    }
}
