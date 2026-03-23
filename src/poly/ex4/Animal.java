package poly.ex4;

public abstract class Animal {//추상이 하나라도있으면

    public abstract void sound();//추상메서드는 바디부분을 못가진다.
    public abstract void move();//이러면 순수추상메서드

    //순수 추상클래스는 규격이다.
    //인터페이스가 있기때문에 순수 추상클래스라는 표현은 쓰지않는다.

    //interface 맴버변수는 public static final이라고 가정
    //interface는 상속이아닌 구현이라고 한다. 메서드 다 구현해야함


}
