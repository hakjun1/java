package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;


        System.out.println(a);
        b = ++a;
        System.out.println(b);

        a = 1;
        b = 0;
        b = a++; //대입을 먼저하고 a를 증가시킨다.
        System.out.println(a+" "+b);

    }
}
