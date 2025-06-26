package oop_animal_app; // アプリケーション処理パッケージ

import java.util.Scanner; // 入出力ライブラリ

import oop_animal_model.Animal; // oop_animal_modelのAnimalクラス

public class AnimalMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 入力用オブジェクト

        System.out.println("コンソールに文字を入力してください"); // 入力用メッセージ
        String input = scanner.nextLine(); // 入力を受け取る（[動物名]:[整数or少数]:[整数]を想定）

        String[] animalsInfo = input.split(","); // コンマ区切りで複数の動物を分割する

        for (String info : animalsInfo) {
            try {
                String[] descriptions = info.split(":"); // 入力された値を「:」で分割

                // 要素数のバリデーションチェック
                if (descriptions.length != 3) {
                    System.out.println("「" + info + "」は正しい形式ではありません。[動物名]:[整数or少数]:[整数]の形式で入力してください");
                    continue; // 次のデータへ
                }

                String name = descriptions[0];                         // 動物名
                double height = Double.parseDouble(descriptions[1]);  // 体長
                int speed = Integer.parseInt(descriptions[2]);        // 速度

                Animal animal = new Animal(name, height, speed); // Animalオブジェクトの生成
                animal.printInfo(); // 情報を出力

            } catch (NumberFormatException e) {
                // 数値変換のバリデーションチェック
                System.out.println("「" + info + "」は正しいデータ型ではありません。[String型]:[Int型]:[Double型]で入力してください。");
            }
        }

        scanner.close(); // リソースの解放
    }
}