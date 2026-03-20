package static1;

public class Data2 {
    public String name;

    public Data2(String name,Counter counter) {
        this.name = name;
        counter.count++;//두번째 인자는 스택영역이다. 매서드종료시 사라지는영역
        //잠깐쓰고 버리는값로그찍기용

    }
}
