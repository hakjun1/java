package pack;

import pack.a.User;//이름이 같다면 import는 하나만 사용할 수 있음

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
