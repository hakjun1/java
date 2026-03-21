package static1;

public class DataCountMain3 {

    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);//힙영역이 아니다.

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);//메서드 영역이다.

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //추가
        //인스턴스를 통한 접근, 하지만 권장하지않는다. 인스턴스 변수인가?하는생각이든다.
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        System.out.println(Data3.count);//100% 스태틱 변수이구나!!
    }
}
