package polymorphism.interface0.car;

// 운전자는 Avante를 소유하고, 운전을 할 수 있다.
public class Driver {
    // 필드
    private Avante avante;
    // 차량이 추가되면 코드가 변경되어야 한다.
    private Sonata sonata;

    // 메서드

    // 자동차를 설정
    public void setAvante(Avante avante) {      // set 치고 Enter
        this.avante = avante;
    }

    public void setSonata(Sonata sonata) {
        this.sonata = sonata;
    }

    // 운전
    public void drive() {
        if (avante !=null) {
            avante.onEngine();
            avante.pressAccel();
            avante.pressBreak();
            avante.offEngine();
        } else if (sonata != null) {
            sonata.onEngine();
            sonata.pressAccel();
            sonata.pressBreak();
            sonata.offEngine();
        }

    }
}
