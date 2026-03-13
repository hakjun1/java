package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; //m 생존시작
        if (true) {
            int x = 20; //x 생존시작 코드블럭 안에서만
            System.out.println("if m = "+m);
            System.out.println("if x = "+x);
        }//x 생존 종료
    }
}
