package game_model; // 子クラス

import java.util.Random; // 乱数生成ライブラリ

public class Adventurer extends Player {

    public Adventurer(String name) {
        super(); // 親（スーパー）クラスのデフォルトコンストラクタの呼び出し

        // getRandomStatで生成した乱数とsetterを使って値を代入（1〜999 のランダム値）
        setName(name); // プレイヤー名
        setHp(getRandomStat()); // 体力
        setMp(getRandomStat()); // 魔力
        setAttack(getRandomStat()); // 攻撃力
        setSpeed(getRandomStat()); // 素早さ	
        setDefense(getRandomStat()); // 防御力
    }

    // privateメソッド
    private static int getRandomStat() {
        return new Random().nextInt(999) + 1; // 乱数を1〜999の間で生成
    }
}
