package poly.ex.sender;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("메일을발송합니다: "+message);
    }
}
