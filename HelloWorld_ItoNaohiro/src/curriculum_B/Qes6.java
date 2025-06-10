package curriculum_B;

import java.util.Random; // 乱数生成標準ライブラリのインポート
import java.util.Scanner; // 入力標準ライブラリのインポート

public class Qes6 {

	public static void main(String[] args) {
		/**********************************************************************************
		* [概要] Qes6 商品在庫台数出力システムの実装
		* [詳細] 入力した商品の残り台数が出力されるシステムを指定条件で作成する
		**********************************************************************************/
		// ユーザーからの商品情報の入力を受け取る処理
		Scanner scanner = new Scanner(System.in); // 入力用オブジェクト
		String inputItems = scanner.nextLine(); // 商品名を取得
		String[] items = inputItems.split("、"); // 取得した商品名を「、」区切りで配列itemsとして受け取る
		
		//乱数生成の初期化
		Random random = new Random();
		
		//条件分岐
		for (String item : items) {
			switch (item) {
				// 対象商品の場合
				case "パソコン": // 商品がパソコンの場合
					int stock = random.nextInt(12); // 在庫数はランダムで0~11個
                    System.out.println(item + "の残り台数は" + stock + "台です"); // 在庫数アナウンス
                    scanner.close(); // リソースを解放
                    break; // 処理の終了
                // その他の場合
				default:
                    System.out.println("『 " + item + " 』は指定の商品ではありません"); // 非指定商品アナウンス
			}
		}
		scanner.close(); // リソースを解放
	}

}
