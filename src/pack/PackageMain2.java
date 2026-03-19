package pack;

//import pack.a.User;//import로 패키지명생략하고 클래스이름만 가져와서 사용가능
import pack.a.*;//모든 클래스포함 사용

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
    }
}
