package polymorphism.ex.ex4;

public class Gingerbread extends Cookie{
    @Override
    public void Jump() {
        System.out.println("진저브레드 맨이 작게 점프합니다!");
    }

    @Override
    public void specialSkill() {
        System.out.println("진저브레드 맨이 생강 파워를 발사합니다!");
    }

    @Override
    public void run() {
        System.out.println("진저브레드 맨이 달립니다!");
    }
}
