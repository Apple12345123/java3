package io_stream;

import java.io.*;

public class IOStream8 {
    // 성능향상 BUffered 보조 스트림
    public static void main(String[] args) throws IOException {
        String origin1 = "src/io_stream/cherry-blossom-1194518.jpg";
        String target1 = "src/io_stream/cherry-blossom-1194518_copy.jpg";

        FileInputStream fis = new FileInputStream(origin1);
        FileOutputStream fos = new FileOutputStream(target1);

        // 이미지 파일을 복사
        long time = copyAndMeasureTime(fis, fos);
        System.out.println("이미지 파일 복사 소요 시간 : " +time + "나노초");
        // 입출력 스트림 종료
        fis.close();
        fos.close();

        // 입출력 스트림 + 보조 스트림(버퍼 스트림)
        String target2 = "src/io_stream/image_copy_buffer.jpg";
        var fis2 = new FileInputStream(origin1);
        var fos2 = new FileOutputStream(target2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        // 버퍼 스트림 사용하여 복사 + 시간 측정
        long bufferTime = copyAndMeasureTime(bis, bos);
        System.out.println("버퍼 스트림을 사용한 이미지 복사 소요 시간 " + bufferTime + "나노초");

        bis.close();
        bos.close();
    }
    static long copyAndMeasureTime(InputStream inputStream, OutputStream outputStream) throws IOException {
        long startTime = System.nanoTime();

        // 입력스트림에서 읽기를 완료 후, 출력 스트림에서 읽은 데이터를 출력
        while (true) {
            int data = inputStream.read();
            if (data == -1) break;
            outputStream.write(data);
        }

        // 시간 측정
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        return time;
    }
}
