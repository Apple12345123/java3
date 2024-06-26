package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network1 {
    public static void main(String[] args) {
        // IP 주소 관련 클래스 InetAddress
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터의 IP 주소 = " + localHost);

            // IP 주소의 정보를 바이트배열, 또는 문자열로 반환
            byte[] address = localHost.getAddress();
            String hostName = localHost.getHostName();      // 내 컴퓨터 이름
            String hostAddress = localHost.getHostAddress();    // 내 컴퓨터 IP

            System.out.println("address = " + address);         // byte <- IP
            System.out.println("hostName = " + hostName);
            System.out.println("hostAddress = " + hostAddress);

            // 도메인 주소로 IP주소 객체 반환
            InetAddress daumIP = InetAddress.getByName("www.daum.net");
            System.out.println("다음 호스트 이름 = " + daumIP.getHostName());
            System.out.println("다음 IP = " + daumIP.getHostAddress());

            // 호스트 이름에 대한 여러 IP주소를 배열로 반환
            InetAddress[] neverIPs = InetAddress.getAllByName("www.naver.com");
            for (InetAddress neverIP : neverIPs) {
                System.out.println(neverIP.getHostName() + " : " + neverIP.getHostAddress());
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        // IP 주소가 할당된 호스트 정보 조회
        String hostName = "www.example.com";

        printALLIP(hostName);
    }


    static void printALLIP(String hostName) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostName);
            System.out.println(hostName + "에 할당된 IP주소들입니다.");
            for (InetAddress inetAddress : allByName) {
                System.out.println(inetAddress.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println(hostName + "에 할당된 IP 주소를 찾지 못했습니다.");
        }
    }
}
