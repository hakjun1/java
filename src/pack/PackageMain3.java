package pack;

import pack.a.User;//이름이 같다면 import는 하나만 사용할 수 있음
//pack.a 만 가져온다 하위패키지가 아니다 계층적구조는 눈으로만이고 자바는 상관없다
public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        //진짜 가끔씩 이름 같은거 쓸때가 있는데 자주쓰는것을 import한다.
    }
}
