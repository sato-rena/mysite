package character;

import java.util.Random;

public class Character {
    protected String name;
    protected int hp;
    protected int mp;
    protected int attackPower;
    protected int speed;
    protected int defense;

    public Character(String name) {
        this.name = name;
        Random random = new Random();
        this.hp = 800 + random.nextInt(100);  // 800-899
        this.mp = 800 + random.nextInt(100);  // 800-899
        this.attackPower = 300 + random.nextInt(100);  // 300-399
        this.speed = 900 + random.nextInt(100);  // 900-999
        this.defense = random.nextInt(50);  // 0-49
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }
}
