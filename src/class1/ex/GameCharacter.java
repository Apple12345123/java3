package class1.ex;
/* GameCharacter 를 설계해주세요.


    - 메인 메서드에서 두 캐릭터를 생성하고 공격을 받고 피해받는 것을 주고받아보세요.
     */
public class GameCharacter {
//    필드:
//    name: 캐릭터의 이름 (String)
//    level: 캐릭터의 레벨 (int)
//    health: 캐릭터의 생명력 (int)
    String name;
    int level;
    int health;

//    생성자:
//    모든 필드를 초기화하는 생성자를 작성하세요.
    GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

//    메서드:
//    attack(): 콘솔에 "name attacks!" 메시지를 출력하는 메서드.
//            takeDamage(int damage): 캐릭터가 받은 데미지를 health에서 차감하는 메서드.
    void attack() {
        System.out.println(name + "공격!");
    }
    void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + "이 공격을 받았습니다."
                + damage + "데미지를 입었습니다. 체력이 "
                + health + "남았습니다.");
    }
}
