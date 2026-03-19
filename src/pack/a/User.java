package pack.a;

public class User {

    public User() {//다른 패키지에서 이 클래서의 생성자를 호출하려면 public를 사용해야 한다.
        System.out.println("패키지 pack.a 회원 생성");
    }
}
