package loop;

public class WhileEx3 {

    public static void main(String[] args) {
        int max = 3;
        int sum = 0;
        int i = 0;
        //
//        for (int i = 0; i <= max; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        while (i<=max) {
            sum += i;
            i++;

        }
        System.out.println(sum);

    }
}
