package fistTest;

import class0.ex.ProductOrder;

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
public class OrderProduct {
    String productName;
    int price;
    int quantity;

    OrderProduct(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        OrderProduct product1 = new OrderProduct("자전거", 50000, 6);
        OrderProduct product2 = new OrderProduct("유모차", 23000, 10);
        OrderProduct product3 = new OrderProduct("모자", 6000, 11);

        OrderProduct[] products = {product1, product2, product3};

        int totalPayment = 0;

        for (OrderProduct product : products) {
            System.out.println("상품명 : " + product.productName + ", " + "가격 : " + product.price + ", " + "수량 : " + product.quantity);
            int payment = product.price * product.quantity;
            totalPayment += payment;

            System.out.println(product.productName + "가격 = " + payment);

            System.out.println("총가격 : " + totalPayment);
        }
    }
}
