package self_introduction_model3;

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
}
