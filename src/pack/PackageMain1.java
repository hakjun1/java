package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data =new Data();
        pack.a.User user = new pack.a.User();//다른경로이므로 전체패키지 경로를 포함해서 클래스를 적어야한다.
                                            //하지만 불편하다 그래서 import를 사용한다.
    }
}
