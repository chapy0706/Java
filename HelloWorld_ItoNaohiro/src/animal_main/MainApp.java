package animal_main;

import animal_model.Animal; // pakageのanimal_modelからAnimalクラスをインポート

public class MainApp {
    public static void main(String[] args) {
        // Animal クラスのインスタンス生成
        Animal lion = new Animal();

        // インスタンスに対してsetterでデータを設定
        lion.setName("ライオン");       // 名前に「ライオン」を代入
        lion.setBodyLength(2.1);       // 体長に2.1mを代入
        lion.setSpeed(80);             // 速度に80km/hを代入

        // setterで設定した値をgetterで出力
        System.out.println("動物名：" + lion.getName());              // 動物名を出力
        System.out.println("体長：" + lion.getBodyLength() + "m");   // 体長を出力
        System.out.println("速度：" + lion.getSpeed() + "km/h");     // 速度を出力
    }
}