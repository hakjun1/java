package static2;

public class DecoUtil2 {

    static String deco(String str) {//DecoUtil1이 의미가없다. static를 붙이자
        String result = "*" + str + "*";
        return result;
        //원래는 return "*" + str + "*"
    }
}
