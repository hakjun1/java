package access;

public class Speaker {
    private int volume;
    //좋은 프로그램 적절한 제약을 넣는것
    //private였다면 직접접근이 아니라 volumeUp를 통해 volume를 조절

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량초과");
        } else {
            volume += 10;
            System.out.println("음량을 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재음량:" + volume);
    }
}
