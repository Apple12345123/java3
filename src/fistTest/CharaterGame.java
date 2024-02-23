package fistTest;

public class CharaterGame {
    String name;
    int level;
    int health;

    CharaterGame(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }
    void attack() {
        System.out.println(name + "공격!");
    }
    void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + "이 공격을 받았습니다." + damage + " 데미지를 입었습니다. 체력이 " + health + " 남았습니다.");
    }

    public static void main(String[] args) {
        CharaterGame david = new CharaterGame("David", 10, 100);
        CharaterGame peter = new CharaterGame("Peter", 10, 100);

        david.attack();
        peter.takeDamage(10);

        peter.attack();
        david.takeDamage(30);
    }
}

