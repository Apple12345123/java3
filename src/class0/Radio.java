package class0;

public class Radio {
    int volume;
    boolean isOn;
     void turnOn() {
        isOn = true;
        System.out.println("라디오 전원을 켰습니다.");
    }

     void volumeUp() {
        // 음량 높이기
        volume = volume + 2;       // volume = volume + 1
        System.out.println("라디오 음량 : " + volume);
    }

     void volumeDown() {
        // 음량 줄이기
        volume--;
        System.out.println("라디오 음량 : " + volume);
    }

     void showRadioStatus() {
        // 라디오 상태 확인
        System.out.println("라디오 상태 확인");
        if (isOn == true) {
            System.out.println("라디오 전원 켜짐, 음량 : " + volume);
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }

     void turnOff() {
        // 라디오 끄기
        isOn = false;
        System.out.println("라디오를 종료합니다.");
    }
}

