package curriculum_B;

import java.util.Scanner; // 入力標準ライブラリのインポート

public class Qes7 {

	public static void main(String[] args) {
		/**********************************************************************************
		* [概要] Qes7 成績管理プログラムの実装
		* [詳細] N人の生徒の成績を管理するプログラムを下記条件で作成する
		**********************************************************************************/
		// ユーザーからの生徒数の入力を受け取る処理
		Scanner scanner = new Scanner(System.in); // 入力用オブジェクト
        int students = 0; // 生徒数を整数型として初期化

        // 1回以上の実行を強制（2人以上の入力必須・数字のみ）
        do {
            System.out.print("生徒の人数を入力してください（2以上）: "); // 入力アナウンス
            String input = scanner.nextLine();// 入力を文字列として受け取る
            // 各種バリデーションチェック
            try {
                students = Integer.parseInt(input); // 入力文字列を整数に変換
                // 数量チェック
                if (students < 2) {
                    System.out.println("2以上の整数を入力してください。"); // 入力値が2未満でエラーメッセージ表示
                }
            // 例外処理
            } catch (NumberFormatException e) {
                System.out.println("整数を入力してください。");  // 数字以外でエラーメッセージ表示
            }
        } while (students < 2); // 2以上の数値が入力されるまでループ継続

        // 点数を保存する2次元配列 [生徒][科目]の準備
        String[] subjects = {"英語", "数学", "理科", "社会"}; // 科目名を文字列配列として格納
        int[][] scores = new int[students][subjects.length]; // 各生徒・各科目の点数を格納する2次元配列

        // 各生徒に対する成績入力のループ処理
        for (int i = 0; i < students; i++) {
            System.out.println(); // 区切り用に改行
            for (int j = 0; j < subjects.length; j++) { // 科目の数だけループ処理
                while (true) {
                    System.out.printf("%d人目の『%s』の点数を入力してください : ", (i + 1), subjects[j]); // 科目ごとの入力アナウンス
                    String scoreInput = scanner.nextLine(); // 科目に対する点数を受け取る
                    try {
                        int score = Integer.parseInt(scoreInput); // 入力文字列を整数に変換
                        // 点数が0〜100の範囲外か判定
                        if (score < 0 || score > 100) { 
                            System.out.println("0～100の範囲で入力してください。"); // 範囲外でエラーメッセージ表示
                        } else {
                            scores[i][j] = score; // 配列に点数を格納
                            break; // 処理の終了
                        }
                    // 例外処理
                    } catch (NumberFormatException e) {
                        System.out.println("整数を入力してください。");  // 数字以外でエラーメッセージ表示
                    }
                }
            }
        }
        System.out.println(); // 区切り用に改行

        // 各生徒の科目平均点の計算と出力
        for (int i = 0; i < students; i++) {
        	int totalScorePerStudent = 0; // 各生徒の科目平均点の初期化
            for (int j = 0; j < subjects.length; j++) {
            	totalScorePerStudent += scores[i][j]; // 科目の点数を加算
            }
            double averageScorePerStudent = (double) totalScorePerStudent / subjects.length; // 各生徒の科目平均点をdouble型で算出
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), averageScorePerStudent); // 各生徒の科目平均点を小数第2位で出力
        }
        System.out.println(); // 区切り用に改行
        

        // 各科目の平均点と全体の平均点の計算と出力
        double totalAverageOfAllSubjectsScore = 0; // 全科目の平均点の合計を保持する変数
        // 科目ごとに処理
        for (int j = 0; j < subjects.length; j++) {
            int totalScorePerSubject = 0; // 各科目の合計点を初期化
            // 生徒ごとに処理
            for (int i = 0; i < students; i++) {
                totalScorePerSubject += scores[i][j]; // 生徒の数だけ指定科目の点数を加算
            }
            double averageScorePerSubject = (double) totalScorePerSubject / students; // 科目平均点の計算
            totalAverageOfAllSubjectsScore += averageScorePerSubject; // 全科目平均の合計に加算
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], averageScorePerSubject);// 科目ごとの平均点を出力
        }
        
        // 全体の科目平均点の計算と出力
        double averageScorePerTotal = totalAverageOfAllSubjectsScore / subjects.length; // 全体の科目平均点の計算（全科目平均点 / 科目数）
        System.out.printf("全体の平均点は%.2f点です。\n", averageScorePerTotal); // 全体の科目平均点の出力
        scanner.close(); // リソース解放
	}

}
