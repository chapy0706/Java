package self_introduction_model3;

import vehicle_model.Bicycle;
import vehicle_model.Car;

public class Person{
	 public static int count = 0;
	 // 問題1：lastNameを追加
	 public String firstName, lastName;
	 public int age;
	 public double height, weight;

	 // 問題2：コンストラクタにlastNameを追加
	 public Person(String firstName, String lasttName,int age, double height, double weight){
		 this.firstName = firstName;
		 // 問題3：lastNameフィールドの値をセット
		 this.lastName = lasttName;
		 this.age = age;
	     this.height = height;
	     this.weight = weight;
	     // 問題3：Person.count++; の追加
	     Person.count++; 
	 }

	 public String fullName(){
		 return this.firstName + this.lastName;
	 }

	 public void print(){
		 System.out.println("名前は" + this.fullName() + "です");
		 System.out.println("年は" + this.age + "です");
	 }

	 public double bmi(){
		 return this.weight / this.height / this.height;
	 }

	 public static void printCount(){
		 System.out.println("合計" + Person.count + "人です");
	 }
	 
	 // 問題6：インスタンスメソッド「buy」を定義（仮引数：car）
	 public void buy(Car car) {
		 // 問題7：setOwnerメソッドとthisを用いてownerフィールドの値をセット
		 car.setOwner(this.fullName());
		 // 問題8：「〇〇が購入しました」と出力
		 System.out.println(car.getOwner() + "が購入しました");
	}
	 
	 // 問題9：buyメソッドを定義（仮引数：bicycle）
	 public void buy(Bicycle bicycle) {
		 bicycle.setOwner(this.fullName());
		 System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
