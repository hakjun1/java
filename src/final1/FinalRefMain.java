package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //변경불가 final

        /*
        Data data = new Data(); // 1번 Data 객체 생성 (data 변수가 1번을 가리킴)
        data = new Data();      // 2번 Data 객체 생성 (data 변수가 이제 2번을 가리킴) - 정상 작동!
         */

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
