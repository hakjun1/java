package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        this(name,age,50);//반드시첫줄에생성

    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자호출 name=" + name + " ,age=" + age + " ,grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;



//        //생성자는 첫글자가 대문자이다.
        //생성자는 반환타입이 없다.
        //제약(장점) 직접정의한 생성자가 있다면 직접정의한 생성자를 반드시 호출해야한다.
        //no suitable constructor found for MemberConstruct(no arguments)오류가 발생한다.
        //즉 생성자를 사용하면 필수값 입력을 보장할 수 있다.(유령회원이 등장한 가능성을 원천 차단한다.)
    }
}
