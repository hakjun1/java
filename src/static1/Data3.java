package static1;

public class Data3 {
    public String name;//맴버(필드)변수
    public static int count;;//공용변수 공용으로 쓴다.,클래스변수
    //붕어빵틀은 하나만 존재

    public Data3(String name) {
        this.name = name;
        count++;
        //Data3.count++;
    }
}
