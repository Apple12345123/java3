package library.util;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        // Long의 최대값 최소값 범위
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // 범위를 넘어가는 매우 큰 수를 다루기 위한 클래스
        // BigInteger
        // Long LongNumber = 786454651321321346546L;   // 넘을 수 없음
        BigInteger bigInt1 = new BigInteger("87654654132135465746454564654564576");
        BigInteger bigInt2 = new BigInteger("1235456786687612212464746576");

        // 덧셈
        BigInteger sum = bigInt1.add(bigInt2);
        System.out.println("큰 수 합계 : " + sum);

        // 뺄셈
        BigInteger sub = bigInt1.subtract(bigInt2);
        System.out.println("큰 수 뺄셈 : " + sub);

        // 곱셈
        BigInteger multiply = bigInt1.multiply(bigInt2);
        System.out.println("큰 수 곱셈 : " + multiply);

        // 나눗셈
        BigInteger divide = bigInt1.divide(bigInt2);
        System.out.println("큰 수 나누기 : "+ divide);

        // 거듭제곱
        BigInteger pow = BigInteger.valueOf(2).pow(128);
        System.out.println("2 ^ 128 : " + pow);

        // 최대 공약수
        BigInteger gcd = bigInt1.gcd(bigInt2);
        System.out.println("큰 수의 최대공약수 : " + gcd);

        // 부동 소수점 정밀도 오류
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
        System.out.println("0.7 - 0.3 = " + (0.7 - 0.3));
        System.out.println("0.2 * 0.4 = " + (0.2 * 0.4));
        System.out.println("0.9 / 0.3 = " + (0.9 / 0.3));

        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");

        System.out.println("====== BigDecimal 사용 =======");
        System.out.println("0.1 + 0.2 = "+ bigDecimal1.add(bigDecimal2));
        System.out.println("0.1 - 0.2 = "+ bigDecimal1.subtract(bigDecimal2));
        System.out.println("0.1 * 0.2 = " + bigDecimal1.multiply(bigDecimal2));

        // 금융계산이나 과학계산에 필요한 고정밀도 연산
    }
}
