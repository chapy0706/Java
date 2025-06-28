package oop_prefecture_model;

public class Prefecture {
    private String name;     // 都道府県名(文字列型)
    private String capital;  // 県庁所在地(文字列型)
    private double area;     // 面積(double型)
    private int index;       // インデックス順(整数型)

    // コンストラクタ：name, capital, area の初期化
    public Prefecture(String name, String capital, double area, int index) {
        this.name = name; // 都道府県名(文字列型)
        this.capital = capital; // 県庁所在地(文字列型)
        this.area = area; // 面積(double型)
        this.index = index; // インデックス順(整数型)
    }
    
    public Prefecture() {} // デフォルトコンストラクタ（引数なし）

    // Getter
    public String getName() {
        return name; // 都道府県名(文字列型)
    }
    public String getCapital() {
        return capital; // 県庁所在地(文字列型)
    }
    public double getArea() {
        return area; // 面積(double型)
    }
    public double getIndex() {
        return index; // インデックス順(整数型)
    }

    // Setter
    public void setName(String name) {
        this.name = name; // 都道府県名(文字列型)
    }
    public void setCapital(String capital) {
        this.capital = capital; // 県庁所在地(文字列型)
    }
    public void setArea(double area) {
        this.area = area; // 面積(double型)
    }
    public void setIndex(int index) {
        this.index = index; // インデックス順(整数型)
    }
}
