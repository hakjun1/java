package array;

public class Array1Ref2 {//배열이란 같은타입의 변수를 사용하기편하게 묶어두는것

    public static void main(String[] args) {
//        int[] students = new int[]{90,80,70,60,50};;
        int[] students = {90,80,70,60,50};//선언함과 동시에써야함 라인나누면 안됨


        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+" 점수"+students[i]);
        }

    }
}
