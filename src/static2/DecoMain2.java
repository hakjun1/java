package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);// 컨트롤 알트 v 참조값생성 할때 잘쓰자
        System.out.println("before " + s);
        System.out.println("after: " + deco);
    }
}
