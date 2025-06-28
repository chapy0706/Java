package oop_prefecture_app;

// 入出力ライブラリ
import java.util.ArrayList;             // リスト操作用ライブラリのインポート
import java.util.Collections;           // リストの逆順ソートライブラリのインポート
import java.util.Comparator;            // ソート条件指定ライブラリのインポート
import java.util.List;                  // Listインターフェース用ライブラリのインポート
import java.util.Scanner;               // コンソール入力ライブラリのインポート

import oop_prefecture_model.Prefecture; // oop_prefecture_modelのPrefectureクラス

public class PrefectureMain {
    public static void main(String[] args) {
    	
    	// 各都道府県のデータ配列を用意
        String[] data = {
            "北海道:札幌市:83424", // 北海道
            "青森県:青森市:9646",  // 青森県
            "岩手県:盛岡市:15275", // 岩手県
            "宮城県:仙台市:7282",  // 宮城県
            "秋田県:秋田市:11638", // 秋田県
            "山形県:山形市:9323",  // 山形県
            "福島県:福島市:13784", // 福島県
            "茨城県:水戸市:6097",  // 茨城県
            "栃木県:宇都宮市:6408", // 栃木県
            "群馬県:前橋市:6362",   // 群馬県
            "埼玉県:さいたま市:3798" // 埼玉県
        };

        // ユーザーからのインデックス順の受け取り
        Scanner scanner = new Scanner(System.in); // 入力用オブジェクト
        System.out.print("都道府県の番号をカンマ区切りで入力してください（例：8,5,9,...）："); // 入力用メッセージ
        String[] indexInputs = scanner.nextLine().split(","); // カンマ区切りでデータを受け取る

        // 昇順/降順の受け取り
        String sortOrder; //ユーザーからの昇順or降順のデータ入力用変数
        while (true) {
            System.out.print("昇順または降順を入力してください（昇順 or 降順）："); // 入力用メッセージ
            sortOrder = scanner.nextLine(); // 入力を受け取る（昇順 or 降順を想定）
            if (sortOrder.equals("昇順") || sortOrder.equals("降順")) {
                break; // 正常値(昇順 or 降順)ならループ終了
            } else {
                System.out.println("入力が正しくありません。"); // その他の入力値はエラーメッセージ
            }
        }
        
        // 選択された都道府県を保持するリスト
        List<Prefecture> selected = new ArrayList<>();

        // 入力されたインデックスに基づいてPrefectureインスタンスfor文で作成
        for (String input : indexInputs) {
            try {
                int index = Integer.parseInt(input.trim()); // 入力値(文字列型)を整数(Int型)に変換し、余計な空白削除
                if (index >= 0 && index < data.length) {
                    String[] parts = data[index].split(":"); // データを「:」で分割
                    Prefecture selectPrefecture = new Prefecture(); // Prefectureインスタンスの作成
                    selectPrefecture.setName(parts[0]);             // 都道府県名(文字列型)
                    selectPrefecture.setCapital(parts[1]);          // 県庁所在地(文字列型)
                    selectPrefecture.setArea(Double.parseDouble(parts[2])); // 面積(double型)
                    selectPrefecture.setIndex(index);               // インデックス順(整数型)
                    selected.add(selectPrefecture); // リストに追加
                } else {
                    System.out.println("「" + index + "」はデータの範囲外の番号です"); // インデックス範囲外の場合のエラーメッセージ
                }
            } catch (NumberFormatException e) {
                System.out.println("「" + input + "」は数値ではありません"); // 数字以外のエラーメッセージ
            }
        }

        // 初期状態をインデックス順で昇順ソートにする
        selected.sort(Comparator.comparingInt(p -> (int) p.getIndex()));

        // 降順が指定された場合は逆順にする
        if (sortOrder.equals("降順")) {
            Collections.reverse(selected); // 逆順ソート
        }

        // 出力処理（各都道府県の情報を表示）
        for (Prefecture outputPrefecture : selected) {
            System.out.println("\n都道府県名：" + outputPrefecture.getName());          // 都道府県名
            System.out.println("県庁所在地：" + outputPrefecture.getCapital());         // 県庁所在地
            System.out.println("面積：" + outputPrefecture.getArea() + "km2");         // 面積
        }
        scanner.close(); // リソース解放
    }
}