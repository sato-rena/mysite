package character;

public class PlayerCharacter extends Character {
    public PlayerCharacter(String name) {
        super(name);
    }

    public void printStatus() {
        System.out.println("こんにちは " + name + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hp);
        System.out.println("MP：" + mp);
        System.out.println("攻撃力：" + attackPower);
        System.out.println("素早さ：" + speed);
        System.out.println("防御力：" + defense);
        System.out.println("さあ冒険に出かけよう！");
    }
}
