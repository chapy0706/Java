package oop_animal_model;

public class Animal {
    private String name;             // 文字列型：動物名
    private double height;           // double型：体長（m）
    private int speed;               // 整数型：速度（km/h）
    private String scientificName;   // 文字列型：学名

    // コンストラクタ：name, height, speed の初期化
    public Animal(String name, double height, int speed) {
        this.name = name; //動物名
        this.height = height; // 体長
        this.speed = speed; // 速度
        this.scientificName = getScientificNameByName(name); // 動物名から学名を取得
    }

    // 動物名から学名を取得するメソッド
    private String getScientificNameByName(String name) {
        switch (name) {
            case "ライオン": return "パンテラ レオ"; // ライオン
            case "ゾウ": return "ロキソドンタ・サイクロティス"; // ゾウ
            case "パンダ": return "アイルロポダ・メラノレウカ"; // パンダ
            case "チンパンジー": return "パン・トゥログロディテス"; // チンパンジー
            case "シマウマ": return "チャップマンシマウマ"; // シマウマ
            default: return "不明"; // 上記以外は学名「不明」
        }
    }

    // 動物の情報を出力するメソッド
    public void printInfo() {
        System.out.println("動物名：" + name); //動物名
        System.out.println("体長：" + height + "m"); // 体長
        System.out.println("速度：" + speed + "km/h"); // 速度
        System.out.println("学名：" + scientificName); // 学名 
        System.out.println(); // 空行で区切る
    }
}