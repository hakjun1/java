package poly.ex.pay0;

public class PayService {//개방,폐쇄(새로운결제수단이 추가되도 코드가 변경되지않아야함)
//Strategy Pattern도입해야한다 -> 바뀌는 부분을 따로 인터페이스로 캡슐화
    public void processPay(String option, int amount) {

        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다");
            result = false;
        }

        if (result) {
            System.out.println("결제가 성공했습니다");
        } else {
            System.out.println("결제가 실패했습니다");
        }
    }
}
