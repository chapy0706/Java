package self_introduction_app2;

import self_introduction_model2.Person;

public class Main{
	 public static void main(String[] argos){
		  Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		  person1.print();
		  Person person2 = new Person("山田花子", 22, 1.5, 40);
		  person2.print();
		  // 問題3：合計人数を出力する
		  System.out.println("合計" + Person.count + "人です");
		  
		  // 問題6：合計人数を出力する(課題1.30と同じ)
		  Person.printCount(); // 合計人数を出力（staticメソッド呼び出し）
		 }
		}
