package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {

        Parent poly = new Child();//x001 2층집을 짓는다 new child **업캐스팅
        //단 자식의 기능은 호출할 수 없다. = > downcasting

//        Child child = (Child) poly;//읽은다음 자식타입으로 지정 **다운캐스팅
//        child.childMethod();//poly의 타입은 여전이 parent 자바의 대입을 생각하자 복사해서대입


        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();//연산자 우선순위때문에 괄호를한다.
        //poly는 Parent타입을 유지한다.
    }


}
