package execute;

import logic_for_execute.Messages; // logic_for_executeパッケージからMessagesクラスをインポート

public class MainApp {
    public static void main(String[] args) {
        Messages greetingMessage = new Messages(); // Messagesクラスのインスタンス生成
        greetingMessage.printMessage();          // 出力メソッドを呼び出す
    }
}