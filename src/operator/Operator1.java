package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = "+sum);

        int multi = a * b;
        System.out.println("a * b = "+multi);

        int div  = a / b;
        System.out.println("a / b = "+div);

        int mod = a % b;
        System.out.println("a % b = "+mod);

//        int z = 10 / 0; 0으로 나누는 것은 수학에서 허용하지 않는다.
    }
}
