package self_introduction_model;

//　パッケージを分けている為、public修飾子を付ける
public class Person{
	// 問題1：インスタンスフィールドを定義（getterの使用指示がないので一旦publicで定義する）
	public String name;   // 名前　※public定義
	public int age;       // 年齢　※public定義
	public double height; // 身長（m）※public定義
    // 問題4：weigntの追加
	public double weight; // 体重（kg）※public定義
	// 問題10：人数のカウント(クラス全体で共有する為static指定)
	public static int count = 0; // インスタンスの数を整数型でカウント
	
	// 問題2：コンストラクタを定義
    public Person(String name, int age, double height, double weight) {
        this.name = name;       // フィールドnameに引数nameの代入
        this.age = age;         // フィールドageに引数ageの代入
        this.height = height;   // フィールドheightに引数heightの代入
        this.weight = weight;   // 問題4：フィールドweightに引数weightを代入
        count++; // 問題10：人数のカウント
    }
    
    // 問題6：bmiを定義する(戻り値：double)
    public double bmi() {
        // 問題7：BMIを計算して返す（体重 / (身長＊身長)）
        return this.weight / (this.height * this.height); // 体重 / (身長＊身長)
    }
    
    // 問題8：printを定義する(戻り値：void)
    public void print() {
        // 問題9：thisを使って出力する
        System.out.println("名前は" + this.name + "です"); // 名前
        System.out.println("年は" + this.age + "才です"); // 年齢
        System.out.printf("BMIは%.1fです\n", this.bmi()); // BMI
    }
    
    // 問題10：合計人数を出力する (static)
    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }    
}