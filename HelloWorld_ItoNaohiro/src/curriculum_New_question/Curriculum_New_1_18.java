package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力
	public static void printMessage(String type, int version) {
		System.out.println("Hello " + type + " " + version); // Hello + 文字列型 + 整数型 → 出力
    }
	
	// Q2：引数に整数を渡すと渡した値同士を乗算
	public static void printMultiply(int a, int b) {
        System.out.println(a * b); // 整数型 * 整数型 → 出力
    }
			
	// Q3：引数として整数の配列を渡すと、受け取った値を順番に出力
	public static void printArray(int[] values) {
        for (int i : values) {
            System.out.println(i); // 配列をfor文で出力
        }
    }
				
	// Q4：Q2をオーバーロード（上書き）して引数を小数2つに変更し、引数同士の和を出力
	public static void printMultiply(double a, double b) {
        System.out.println(a + b); // Q2と同じ関数名でdouble型 ＋ double型 → 出力
    }
			
	// Q5：引数の整数回、1～100までのランダムな数字を格納し出力後、格納した値を返す（0は出力＆格納しない）
	public static int[] generateRandomNumbers(int count) {
        Random rand = new Random(); // Randomクラスのインスタンスを作成
        int[] result = new int[count]; // 生成した乱数を格納する配列の準備
        // 指定回数までループ処理
        for (int i = 0; i < count; i++) {
            int number; // 生成する乱数用の整数型の変数
            do {
                number = rand.nextInt(100) + 1; // 1～100までのランダムな整数を生成（0は含まれない）
            } while (number == 0); // 0の場合は排除させる
            
            result[i] = number; // 生成した乱数をresultに格納
            System.out.println(number); // 格納した値の出力
        }
        return result; // 配列を返す
    }

	// Q6：Q5で作成したメソッドの返り値から配列の要素の平均値を出力する　※小数点以下も表示する
	public static double calculateAverage(int[] array) {
	    int sum = 0; // 配列内の値の合計を格納する変数の初期化
	    // 配列の各要素を順番に取り出す
	    for (int i : array) {
	        sum += i; // 合計値に加算
	    }
	    double average = (double) sum / array.length; // 合計値を要素数で割り、平均値を算出
	    System.out.printf("%.2f\n", average); // 平均値を小数第2位まで表示

	    return average; // 平均値を返す
	}
		
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalse
	public static void isAverageAbove50(double avg) {
	    boolean result = avg >= 50; // 平均値が50以上ならtrue、50未満ならfalseを代入
	    System.out.println(result); // 結果を出力
	}

	
	//main関数
	public static void main(String[] args) {
		// Q1: 文字列と整数を渡して出力
        printMessage("JavaSE", 11);

        // Q2: 整数の乗算
        printMultiply(3, 4);

        // Q3: 整数配列を順番に出力
        int[] array = {10, 20, 30};
        printArray(array);

        // Q4: 小数を渡して加算
        printMultiply(3.4, 5.6);

        // Q5: 乱数の整数配列を生成し出力＆返却
        int[] randomNumbers = generateRandomNumbers(5);

        // Q6: 配列の平均値を出力(Q5の配列を用いる)
        double average = calculateAverage(randomNumbers);

        // Q7: 平均値が50以上か判定し出力
        isAverageAbove50(average);
	}
}