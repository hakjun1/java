package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //사용하는입장에서 volume필드에 직접 접근 가능
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200;
        speaker.showVolume();
    }
}
