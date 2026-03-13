package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;//객체를 생성할때 참조값을 반환 어딘가에 저장해야한다. student1
        student1 = new Student();//객체 또는 인스턴스
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:"+student1.name);
        System.out.println("이름:"+student2.name);
    }
}
