package poly.ex.pay0;

import poly.ex.pay1.Pay;

public class NaverPay {

    public boolean pay(int amount) {
        System.out.println("네이버페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시작합니다.");
        return true;
    }
}
