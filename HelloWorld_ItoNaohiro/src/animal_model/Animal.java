package animal_model;

public class Animal {
	//フィールド定義
    private String name; // 動物の名前
    private double bodyLength; // 動物の体長（単位：m）
    private int speed; // 動物の速度（単位：km/h）

    // setterメソッド
    public void setName(String name) {
        this.name = name; // 動物の名前
    }
    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength; // 動物の体長
    }
    public void setSpeed(int speed) {
        this.speed = speed; // 動物の速度
    }

    // getterメソッド
    public String getName() {
        return this.name; // フィールドのnameを返す
    }
    public double getBodyLength() {
        return this.bodyLength; // フィールドのbodyLengthを返す
    }
    public int getSpeed() {
        return this.speed; // フィールドのspeedを返す
    }

}