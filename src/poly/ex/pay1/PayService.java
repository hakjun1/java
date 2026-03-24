package poly.ex.pay1;

public class PayService {

    public void processPay(String option, int amount) {
        //리팩토링 시작 , pay라는 역활에만 의존 구체적인 네이버,카카오 모름

        Pay pay = PayStore.findPay(option);//pay만 의존
        boolean result = pay.pay(amount);
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);





        //결제수단을 선택하는부분과 실제 수행하는 부분으로 쪼개졌다.

        if (result) {
            System.out.println("결제가 성공했습니다");
        } else {
            System.out.println("결제가 실패했습니다");
        }
    }


}
