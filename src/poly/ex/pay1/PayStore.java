package poly.ex.pay1;

public class PayStore {

    public static Pay findPay(String payOption) {
        if(payOption.equals("kakao")) {
            return new KakaoPay();
        } else if(payOption.equals("naver")) {
            return new NaverPay();
        } else if(payOption.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }

}