package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();//객체 또는 인스턴스
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //자바에서 대입은 변수에 들어있는 값을 복사한다.
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;


        System.out.println("이름:"+students[0].name);
        System.out.println("이름:"+students[1].name);
    }
}
