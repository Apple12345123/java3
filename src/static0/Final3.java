package static0;

public class Final3 {
    // (Final)상수와 참조형 변수
    public static void main(String[] args) {
        final int var1 = 100;
        // var1 = 200;     // final 값은 변경 불가

        final Data data = new Data(100);   // 0x100 데이터는 참조 값을 저장한다.
        System.out.println(data.getField());

        // data =  new Data(200);   // final 값은 변경 불가
        // 참조 값 변수를 final로 지정했을 때, 참조 값 자체는 변경 불가능 하지만

        // 참조 값에 위치해있는 객체 내부의 값을 변경하는 것은 가능하다.
        data.setField(200);      // 0x100 일 필요 없음.
        System.out.println(data.getField());
    }
}
