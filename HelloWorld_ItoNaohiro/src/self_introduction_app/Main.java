package self_introduction_app;

import self_introduction_model.Person; // self_introduction_modelのPersonクラスの読み込み

// パッケージを分けている為、public修飾子を付ける
public class Main { 
	  public static void main(String[] args) {
		// 問題5：引数にweightの60を追加
	    Person person1 = new Person("鈴木太郎", 20, 1.7, 60); //60を追記

	    System.out.println(person1.name); // 名前
	    System.out.println(person1.age); // 年齢
	    System.out.println(person1.height); // 身長
	    System.out.println(); //改行
	    
	    // 問題9：thisを使って出力
	    person1.print(); // person1の情報を出力
	    System.out.println(); //改行
	    
	    // 問題10：合計人数を出力する
	    Person.printCount(); // 合計人数を出力（staticメソッド呼び出し）
	  }
}
