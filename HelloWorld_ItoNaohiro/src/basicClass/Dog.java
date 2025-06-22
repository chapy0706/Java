package basicClass;

public class Dog {
    // Q1：フィールドに動物の名前の変数を定義
    String name;

    // Q2：フィールドに動物の数の変数を定義
    int count;

    // Q3：Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成
    public Dog() {
        this.name = "犬"; // 変数nameに「犬」を代入
    }

    // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成
    public Dog(int count) {
        this.count = count; // 引数のcountを変数に代入
    }
}
