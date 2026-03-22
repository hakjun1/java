package final1.ex;
//final 정의하고 바꾸지 않아야할때
public class Member {

    private final String id;//초기화를 시켜줘야한다. 생성자로받는것, 애초에 지정하는것
    private String name;

    public Member(String id, String name) {//여 기서 지정된다.
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
        //this.id = id; 바꿀수없다.
        this.name = name;
    }

    public void print() {
        System.out.println(id+" "+name);
    }
}
