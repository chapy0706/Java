package self_introduction_app3;

import self_introduction_model3.Person; // self_introduction_model3のPersonクラスの読み込み
import vehicle_model.Bicycle; // vehicle_modelのBicycleクラス
import vehicle_model.Car; // vehicle_modelのCarクラス

public class Main{
	 public static void main(String[] args){
		  Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		  person1.print();

		  Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		  person2.print();

		  Person.printCount();
		  
		  // 問題4：car所有者「person1」・bicycle所有者「person2」
		  Car car = new Car(); // Carクラスcar
		  Bicycle bicycle = new Bicycle(); // Bicycleクラスのbicycle
		  car.setOwner(person1.fullName()); //person1のfullname
		  bicycle.setOwner(person2.fullName()); //person2のfullname
		  // 問題5：ownerをコンソールに出力
		  System.out.println(car.getOwner());
		  System.out.println(bicycle.getOwner());
		  
		  //問題10：「person1」がcarを購入、「person2」がbicycleを購入するプログラム
		  person1.buy(car);
		  person2.buy(bicycle);
	}
}
