package class1;

public class ClassStart5 {

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
        Student[] students = /*new Student[]*/{student1,student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:"+students[i].name);
        }

        //축약
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:"+s.name);
        }
        //iter많이씀
        for (Student s : students) {
            System.out.println("이름:"+s.name);
        }
    }
}
