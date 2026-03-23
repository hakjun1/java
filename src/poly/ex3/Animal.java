package poly.ex3;

public abstract class Animal {//추상이 하나라도있으면

    public abstract void sound();//추상메서드는 바디부분을 못가진다.

    public void move() {//오버라이딩 하지 않아도 된다.
        System.out.println("animal move");
    }

    //실수로 오버라이딩 하지않은 인스턴스를 생성하는걸 추상클래스가 방지해준다.
    //개발자가 실수로 안해서 main에 soundAnimal메서드에 집어넣으면 구현이 안되있는걸 방지해준다.
    //즉 실수로 입력안한 메서드가 부모것이 호출되는걸 방지해준다 제약이 추가된것
}
