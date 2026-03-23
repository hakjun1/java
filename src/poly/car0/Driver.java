package poly.car0;

public class Driver {//자동차가 늘어나는데 자동차 운전자의 코드를 고쳐야한다.

    private K3Car k3Car;//운전자는 k3을 가진다.
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;// 호출하면 자동차가 생긴다., 외부에서 참조값이넘어온다.
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }



    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }

    }
}
