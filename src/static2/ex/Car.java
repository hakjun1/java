package static2.ex;

public class Car {
    private String carName;
    private static int count;//private에 주의 car클래스내부에서만 count를 바꿀수있게한다.

    public Car(String carName) {
        this.carName = carName;
        System.out.println("차량 구입, 이름: "+carName);
        count++;
    }

    static void showTotalCard() {
        System.out.println("구매한 차량 수 : "+count);
    }
}
