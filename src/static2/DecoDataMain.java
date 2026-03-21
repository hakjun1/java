package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    //main메서드 정적메서드다. 같은 클래스 내애있는 정적메서드만 호출가능 아니라면 인스턴스생성해야한다.
    public static void main(String[] args) {
        System.out.println("1. 정적호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();//클래스네임 여러번쓴다. 그럴때 import를 한다.
//        import static static2.DecoData.staticCall; 클래스명 생략 가능 별쓰면 모든 메서드쓸수있다.



        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        staticCall();//쿠션먹고들어감, 이렇게쓰면안됨 인스턴스같잖아

        //클래스를 통한 접근
        staticCall();
    }
}
