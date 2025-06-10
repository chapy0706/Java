package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		/**********************************************************************************
		* [概要] 掛け算の表の作成
		* [詳細] for文を用いて掛け算の表を作成する(最大9の段*20の列)
		**********************************************************************************/
		
		// 先頭の段の数字を1~9をそれぞれ出力
		for (int i = 1; i <= 9; i++) {
			// 先頭の列の数字を1~20をそれぞれ出力
            for (int j = 1; j <= 20; j++) {
                // 文字列multiplicationに格納する
                String multiplication = String.format("%03d * %03d = %03d", i, j, i * j); // 3桁ゼロ埋めになるように各項目を整形
                // "||"をつけて整形
                if (j < 20) {
                    System.out.print(multiplication + " || "); // 式の後に || を追加
                } else {
                    System.out.print(multiplication); // 20の列で改行する
                }
            }
            System.out.println(); // 9の段で改行する
        }

	}

}
