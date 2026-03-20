package static1;

public class Data3 {
    public String name;
    public static int count; // static은 스택 영역에 생성

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
