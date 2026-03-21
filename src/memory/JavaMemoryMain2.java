package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }
    //힙영역에있는 DATA인스턴스는 참조하는곳이 없어지는순간 사라진다
    //가비지 컬렉션이 메모리누적을 막아 자동으로 삭제시킨다.
    //c언어는 이게없기에 수동으로 해야한다.
    //힙영역 안에서만 참조하는 경우에도 삭제됨 (중요하지는 않음)

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end");
        ;
    }
}
