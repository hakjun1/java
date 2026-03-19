package construct;

public class MemberInit {
    String name;
    int age;
    int grade;
    //생성자가 없으므로 자바가 기본생성자를 생성한다.
    //하나라도 있으면 자바는 기본생성자를 만들지 않는다.

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
