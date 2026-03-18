package oop1;

public class ValueObject {

    int value;

    void add() {//static 키워드를 사용하지않는다.
        value++;
        System.out.println("숫자 증가 value=" + value);
    }//static이 붙으면 객체를 생성하지 않고도 메서드를 호출할 수 있다.
}
