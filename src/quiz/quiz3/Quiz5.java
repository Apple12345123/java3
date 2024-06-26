package quiz.quiz3;

import java.util.Objects;

/*
상품 클래스 재정의하기

    Product 클래스는 상품을 나타내며, 상품의 이름(name), 가격(price), 수량(quantity)을 저장합니다.
    Product 클래스는 Object 클래스의 메서드 중 일부를 오버라이드합니다.
    equals 메서드는 이름, 가격, 수량이 모두 동일한 경우에만 true를 반환합니다.
    hashCode 메서드는 이름, 가격, 수량을 기반으로 해시 코드를 생성합니다.
    toString 메서드는 "상품: [이름], 가격: [가격], 수량: [수량]" 형식의 문자열을 반환합니다.
    Product 클래스의 객체를 생성하고, equals, hashCode, toString 메서드를 각각 호출하여 결과를 출력하세요.

    실행결과
    ===
    equals 메서드 호출 결과: true
    hashCode 메서드 호출 결과 (product1): 635023629
    hashCode 메서드 호출 결과 (product2): 635023629
    toString 메서드 호출 결과 (product1): 상품: Apple, 가격: 2.5, 수량: 10
    toString 메서드 호출 결과 (product2): 상품: Apple, 가격: 2.5, 수량: 10
 */
public class Quiz5 {
    static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return price == product.price && quantity == product.quantity && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price, quantity);
        }

        @Override
        public String toString() {
            return "상품: " +
                    name +
                    ", 가격: " + price +
                    ", 수량: " + quantity ;
        }
    }

    public static void main(String[] args) {
        Product apple1 = new Product("Apple", 2.5, 10);
        Product apple2 = new Product("Apple", 2.5, 10);

        apple1.equals(apple2);

        if (apple1.equals(apple2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(apple1.hashCode());
        System.out.println(apple2.hashCode());

        System.out.println(apple1.toString());
        System.out.println(apple2.toString());
    }
}
