package access.b;

import access.a.AccessData;

public class AccessOutterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

//        다른 패키지 default 호출 불가
//        data.defaultField = 2;
//        data.defaultMethod();

//        //private 호출 불가 , 인텔리제이 나오지도 않음
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();//메서드안에서는 내부호출
    }

}
