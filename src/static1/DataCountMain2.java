package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();//Data2가 몇개 생성되는지 알고싶다.
                                        //인스턴스가 계속생긴다.필드변수도 계속 생긴다.
                                        //외부에서 끌어온다.(단점,불편)=>안에서 해결하고싶다.
        Data2 data1 = new Data2("A", counter);//컨트롤+알트 +v
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count" + counter.count);
    }
}
