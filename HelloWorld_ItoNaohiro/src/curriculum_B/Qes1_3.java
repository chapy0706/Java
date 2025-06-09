package curriculum_B;

import java.util.Random; //Qes3 Javaの乱数生成標準ライブラリのインポート
import java.util.Scanner; //Qes1,2 Javaの入力標準ライブラリのインポート

public class Qes1_3 {

	public static void main(String[] args) {
		/**********************************************************************************
		* [概要] Qes1~3 入力バリデーションチェック・じゃんけんゲームの実装
		* [詳細] ログイン時の入力チェックシステムからじゃんけんゲームまでを指定条件で作成する
		**********************************************************************************/
		Scanner scanner = new Scanner(System.in); // 入力用オブジェクト

        String InputName = scanner.nextLine(); // ユーザー名を取得

        // 入力チェック処理
        if (InputName == null || InputName.trim().isEmpty()) {
            System.out.println("「名前を入力してください」"); // 空欄バリデーションチェック
            scanner.close(); // リソースを解放
            return; // 例外処理(強制終了)
        } else if (InputName.length() > 10) {
            System.out.println("「名前を10文字以内にしてください」"); // 文字数バリデーションチェック(10文字)
            scanner.close(); // リソースを解放
            return; // 例外処理(強制終了)
        } else if (!InputName.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("「半角英数字のみで名前を入力してください」"); // Qes2 正規表現での半角英数字バリデーションチェック
            scanner.close(); // リソースを解放
            return; // 例外処理(強制終了)
        }
        // 正常な入力値を受け取った場合、後続処理に移行する
        System.out.println("ユーザー名「" + InputName + "」を登録しました");  // 登録アナウンス
        System.out.println("じゃんけんを始めましょう！"); // じゃんけん開始アナウンス
        System.out.println("0：グー、1：チョキ、2：パー"); //3択の表示
        
        // じゃんけん開始 ---
        int result = 0; //整数型のじゃんけんの試行回数を初期化
        Random random = new Random(); //乱数生成標準ライブラリの初期化
        
        // 入力チェック処理
        while (true) {
            System.out.print("あなたの手を入力してください（0～2）：");  // 入力待ち
            int player; //整数型でプレイヤーのじゃんけんの手を準備
            try {
                player = Integer.parseInt(scanner.nextLine()); // プレイヤーの入力値を取得(正常系)
                if (player < 0 || player > 2) {
                    System.out.println("0～2の数字を入力してください"); // 数字の範囲チェック
                    continue; // 処理の継続(入力待ちの状態に戻す)
                }
            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください"); // 文字のバリデーションチェック(例外処理)
                continue; // 処理の継続(入力待ちの状態に戻す)
            }
            
            // CPU(相手)のじゃんけんの手を生成する
            int cpu = random.nextInt(3); // 0,1,2からランダムに生成
            result++; // 相手の手を生成した際に試行回数を追加する

            String[] hands = {"グー", "チョキ", "パー"}; // 配列の作成 0:"グー" 1:"チョキ" 2:"パー"
            System.out.println(InputName +"の手：" + hands[player]); // 入力値からじゃんけんの手を出力
            System.out.println("相手の手：" + hands[cpu]); // 乱数生成値からじゃんけんの手を出力

            // 判定処理
            // 引き分け時の場合(処理をループさせる)
            if (player == cpu) {
                System.out.println("DRAW あいこ もう一回しましょう！"); // 両者の値が一致で引き分けのセリフ
                continue; // 処理の継続(入力待ちの状態に戻す)
            }
            
            // 決着がつく場合(プレイヤーが勝利する場合)の条件式の戻り値を真偽値にする
            boolean win = 
            		(player == 0 && cpu == 1) || 	// グー vs チョキ
            		(player == 1 && cpu == 2) || 	// チョキ vs パー
                    (player == 2 && cpu == 0);  	// パー vs グー
            
            // 決着時の処理
            if (win) {
            	System.out.println("やるやん。\n次は俺にリベンジさせて"); // プレイヤーが勝利時のセリフ
            	break; // 処理の終了
            } else {
            	System.out.println("俺の勝ち！"); // 相手が勝利時の最初のセリフ
            	switch (cpu) {
            	case 0: // 自分がじゃんけんでグーに負けた場合のセリフと後続処理
            		System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
            		break; // 処理の終了
            	case 1: // 自分がじゃんけんでチョキに負けた場合のセリフと後続処理
            		System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
            		break; // 処理の終了
            	case 2: // 自分がじゃんけんでパーに負けた場合のセリフと後続処理
            		System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
            		break;	 // 処理の終了
            	}
            }
        }
        // プレイヤー勝利時の試行回数結果の出力
        System.out.println("勝つまでにかかった合計回数は" + result + "回です"); // 試行回数の出力
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
