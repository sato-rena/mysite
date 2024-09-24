package processing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2processing {
    private String greeting;          // 挨拶メッセージ
    private String sushiTaste;        // 寿司の味に関するメッセージ
    private String sushiType;         // 寿司の種類に関するメッセージ
    private String currentDateTime;   // 現在の日付と時刻

    // コンストラクタ
    public Theme2processing() {
        this.greeting = "こんにちは！ここは日本です！";
        this.sushiTaste = "この寿司は美味しいです。";
        this.sushiType = "寿司は和食の一つです。";
        this.currentDateTime = getCurrentDateTime();
    }

    // 現在の日付と時刻を取得するメソッド
    private String getCurrentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    // メッセージを表示するメソッド
    public void displayMessages() {
        System.out.println(greeting);
        System.out.println(sushiTaste);
        System.out.println(sushiType);
        System.out.println("現在の日時は" + currentDateTime + "です。");
    }
}
