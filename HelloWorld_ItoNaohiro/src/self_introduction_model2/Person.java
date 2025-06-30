package self_introduction_model2;
// getterの使用指示がないので一部publicで定義する
public class Person{
	 public String name;
	 public int age;
	 public double height;
	 public double weight;
	 // 問題1：countの定義(課題1.30と同じ)
	 public static int count = 0; // インスタンスの数を整数型でカウント

	 public Person(String name, int age, double height, double weight){
		 // インテンドが合っていないので修正
		 this.name = name;
		 this.age = age;
		 this.height = height;
		 this.weight = weight;
		 count++; // 問題2：コンストラクタの中でカウント(課題1.30と同じ)
	 }

	 public double bmi(){
		 // インテンドが合っていないので修正
		 return this.weight / this.height / this.height;
	 }

	 public void print(){
		 // インテンドが合っていないので修正
		 System.out.println("名前は" + this.name + "です"); // name()の変数は定義していないのでnameに変更
		 System.out.println("年は" + this.age + "です"); // age()の変数は定義していないのでageに変更
	 }
	 
	 // 問題4：printCountの定義 (課題1.30と同じ)
	 public static void printCount() {
		 // 問題5：合計人数を出力する (課題1.30と同じ)
		 System.out.println("合計" + count + "人です");
	 }
}