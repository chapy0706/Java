package basicClass;

import java.time.LocalDateTime; // 日時取得用ライブラリのインポート
import java.time.format.DateTimeFormatter; // 日付フォーマット用ライブラリのインポート

public class Animal {

    public static void main(String[] args) {

        // Q1：Dogクラスのインスタンスを生成し、名前を出力
        Dog dogName = new Dog(); // 引数なしコンストラクタでDogを生成（名前が「犬」に設定される）
        System.out.println(dogName.name); // nameの値を出力

        // Q2：Dogクラスのインスタンスを生成し、数を出力
        Dog dogCount = new Dog(3); // 数を引数として渡すコンストラクタでDogを生成
        System.out.println(dogCount.count); // countの値を出力

        // 現在の日時を「yyyy-MM-dd H:m:s」形式で出力
        LocalDateTime nowDate = LocalDateTime.now(); // 現在の日時を取得
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); // 出力フォーマットを指定
        String formattedDate = nowDate.format(formatter); // 日時を指定フォーマットで文字列化
        System.out.println(formattedDate); // 日時を出力
    }
}
