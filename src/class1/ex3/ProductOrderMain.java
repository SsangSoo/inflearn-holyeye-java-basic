package class1.ex3;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] productOrders = {dubu, kimchi, cola};

        int totalAmount = 0;
        for(ProductOrder po : productOrders) {
            System.out.println("상품명: " + po.productName + ", 가격: " + po.price + ", 수량: " + po.quantity);
            totalAmount += po.price * po.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);


    }
}
