package class0.ex;
/*
ProductOrder 클래스를 생성하고,
상품명, 가격, 주문수량 필드를 만든다.
productName, price, quantity

상품, 가격, 수량을 3개 담아서
총 결제금액을 계산하는 프로그램을 만들어보세요.

출력예시
====
주문 상품 정보:
상품명: 노트북, 가격: 10000000원, 수량: 2개
상품명: 마우스, 가격: 15000원, 수량: 3개
상품명: 키보드, 가격: 50000원, 수량: 1개
총 결제 금액: 2065000원
 */
public class ProductOrder {
    String productName;
    int price;
    int quantity;

    public static void main(String[] args) {


        // 상품 주문 객체를 3개 생성
        ProductOrder product1 = new ProductOrder();
        product1.productName = "노트북";
        product1.price = 10000000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "마우스";
        product2.price = 15000;
        product2.quantity = 3;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "키보드";
        product3.price = 50000;
        product3.quantity = 1;

        // 생성한 객체를 배열에 저장
        ProductOrder[] products = {product1, product2, product3};

        int totalPayment = 0;

        // 객체 정보 출력
        for (ProductOrder product : products) {
            System.out.println("상품명: " + product.productName + ", " + "가격: " + product.price + ", " + "수량: " + product.quantity);
            int payment = product.price * product.quantity;
            totalPayment += payment;

            System.out.println( product.productName + "가격 = " + payment);

        }

        System.out.println("총 가격 = " + totalPayment);
    }
}
