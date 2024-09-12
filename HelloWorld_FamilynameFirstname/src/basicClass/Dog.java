package basicClass;

public class Dog {
    // Q1：フィールドに動物の名前の変数を定義してください。
    private String name;

    // Q2：フィールドに動物の数の変数を定義してください。
    private int count;

    // Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
    public Dog() {
        this.name = "犬";
    }

    // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
    public Dog(int count) {
        this(); // 「犬」を代入するコンストラクタを呼び出し
        this.count = count; // 動物の数を引数で設定
    }

    // 名前を取得するメソッド
    public String getName() {
        return name;
    }

    // 動物の数を取得するメソッド
    public int getCount() {
        return count;
    }
}
