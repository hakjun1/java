package final1;

public class ConstructInit {

    final int value;//오류 - 파이널을 필드에쓸경우 생성자를 통해서 넣어줘야한다.

    public ConstructInit(int value) {
        this.value = value;
    }
}
