package logic_for_execute; //pakageのexecute用のロジックパッケージ

import java.time.LocalDateTime;             // 日付取得用ライブラリのインポート
import java.time.format.DateTimeFormatter;  // 日付フォーマット用ライブラリのインポート

public class Messages {
	// フィールドの定義
    String greeting;     // 最初のあいさつ
    String foodComment;  // 食べ物のコメント
    String foodInfo;     // 食べ物の詳細
    String currentDate;  // 現在日時（文字列）

    // コンストラクタ（初期値を代入）
    public Messages() {
        this.greeting = "こんにちは！ここは日本です！";          // thisで明示的にフィールドに代入
        this.foodComment = "この寿司はうまい";                // thisで明示的にフィールドに代入
        this.foodInfo = "寿司は和食です";                      // thisで明示的にフィールドに代入

        LocalDateTime now = LocalDateTime.now();             // 現在の日時を取得
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); // フォーマット指定
        this.currentDate = now.format(formatter);            // 文字列に変換して代入
    }

    // メッセージを出力
    public void printMessage() {
        System.out.println(this.greeting);                         // あいさつ出力
        System.out.println(this.foodComment);                      // 食べ物のコメント出力
        System.out.println(this.foodInfo);                         // 食べ物の詳細出力
        System.out.println("今の現在日時は" + this.currentDate + "です"); // 日時出力
    }
}
