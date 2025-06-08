package curriculum_B;

import java.util.Scanner; //Qes1,2 Javaの入力標準ライブラリのインポート

public class Qes1_3 {

	public static void main(String[] args) {
		/**********************************************************************************
		* [概要] Qes1 入力バリデーションチェックの実装
		* [詳細] ログイン時の入力チェックシステムを指定条件で作成する
		**********************************************************************************/
		Scanner scanner = new Scanner(System.in); // 入力用オブジェクト

        String InputName = scanner.nextLine(); // ユーザー名を取得

        // 入力チェック処理
        if (InputName == null || InputName.trim().isEmpty()) {
            System.out.println("名前を入力してください"); // 空欄バリデーションチェック
        } else if (InputName.length() > 10) {
            System.out.println("名前を10文字以内にしてください"); // 文字数バリデーションチェック(10文字)
        } else if (!InputName.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("半角英数字のみで名前を入力してください"); // Qes2 正規表現での半角英数字バリデーションチェック
        } else {
            System.out.println("ユーザー名「" + InputName + "」を登録しました");
        } // 登録アナウンス

        scanner.close(); // リソースを解放
        
        /**********************************************************************************
		* [概要] Qes2 入力バリデーションチェックの追加
		* [詳細] ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力する
		**********************************************************************************/
        /*
         * Ques1_3.javaの21行目に追記済み
         * else if (!InputName.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("半角英数字のみで名前を入力してください");
        	}
        */
	}
}
