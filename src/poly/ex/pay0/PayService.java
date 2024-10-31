package poly.ex.pay0;


import poly.ex.pay1.KakaoPay;
import poly.ex.pay1.NaverPay;
import poly.ex.pay1.NewPay;
import poly.ex.pay1.Pay;
import poly.ex.pay1.PayStore;

public class PayService {


    public void processPay(String payOption, int amount) {

        System.out.println("결제를 시작합니다: option=" + payOption + ", amount=" + amount);

        boolean result = false;
        if(payOption.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if(payOption.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else if(payOption.equals("new")) {
            NewPay newPay = new NewPay();
            result = newPay.pay(amount);
        } else {
            result = false;
            System.out.println("결제 수단이 없습니다.");
        }

        if(result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }

    }


}
