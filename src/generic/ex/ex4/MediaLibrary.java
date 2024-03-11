package generic.ex.ex4;
/*
미디어 항목의 기본 인터페이스 정의:
Media 인터페이스를 정의하고, 모든 미디어 항목이 가져야 하는 getTitle() 메소드를 포함시킵니다.

다양한 미디어 타입 클래스 구현:
Media 인터페이스를 구현하는 Book, Movie, Music 클래스를 각각 정의합니다.
각 클래스는 적절한 속성(예: 저자, 감독, 아티스트)과 메소드를 가집니다.
 */
public class MediaLibrary<T extends Media> {
    Media[] mediaArray = new Media[10];
    int index = 0;

    void addMedia(T media) {
        mediaArray[index++] = media;
    }

    void printMediaTitles() {
        for (int i = 0; i < index; i++) {
            System.out.println(mediaArray[i].getTitle());
        }
    }

}
