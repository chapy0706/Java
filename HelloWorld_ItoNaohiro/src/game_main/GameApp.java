package game_main;

import java.util.Scanner; // 入出力ライブラリ

import game_model.Adventurer; // game_modelパッケージのAdventurerクラス

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 入力用オブジェクト

        System.out.print("あなたの名前を入力してください: "); // 入力指示メッセージ
        String inputName = scanner.nextLine(); // 入力値を文字列inputNameとして受け取る

        Adventurer adventurer = new Adventurer(inputName); // プレイヤーのステータスをランダム生成

        System.out.println("こんにちは 「" + adventurer.getName() + "」 さん"); // プレイヤー名
        System.out.println("ステータス");
        System.out.println("HP：" + adventurer.getHp()); // 体力
        System.out.println("MP：" + adventurer.getMp()); // 魔力
        System.out.println("攻撃力：" + adventurer.getAttack()); // 攻撃力
        System.out.println("素早さ：" + adventurer.getSpeed()); // 素早さ	
        System.out.println("防御力：" + adventurer.getDefense()); // 防御力

        System.out.println("\nさあ冒険に出かけよう！"); // スタートメッセージ

        scanner.close(); // リソース解放
    }
}

