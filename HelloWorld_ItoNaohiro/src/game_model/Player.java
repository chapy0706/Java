package game_model; //　親クラス（スーパークラス）

public class Player {
	
	// フィールド定義
    private String name; // プレイヤー名
    private int hp; // 体力
    private int mp; // 魔力
    private int attack; // 攻撃力
    private int speed; // 素早さ	
    private int defense; // 防御力

    public Player() {
        // setterで値を入れるためのデフォルトコンストラクタ
    }

    // setter
    public void setName(String name) {
        this.name = name; // プレイヤー名
    }
    public void setHp(int hp) {
        this.hp = hp; // 体力
    }
    public void setMp(int mp) {
        this.mp = mp; // 魔力
    }
    public void setAttack(int attack) {
        this.attack = attack; // 攻撃力
    }
    public void setSpeed(int speed) {
        this.speed = speed; // 素早さ	
    }
    public void setDefense(int defense) {
        this.defense = defense; // 防御力
    }

    // getter
    public String getName() {
        return name; // プレイヤー名
    }
    public int getHp() {
        return hp; // 体力
    }
    public int getMp() {
        return mp; // 魔力
    }
    public int getAttack() {
        return attack; // 攻撃力
    }
    public int getSpeed() {
        return speed; // 素早さ	
    }
    public int getDefense() {
        return defense; // 防御力
    }
}

