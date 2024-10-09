class Person {
    // 問題1: インスタンスフィールドを定義
    String name;    
    int age;        
    double height;  
    double weight;  // 問題4: フィールド名: weight, データ型: double

    // 問題3: コンストラクタを定義しインスタンスフィールドに値をセット
    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight; 
    }

    // 問題6: BMI
    double bmi() {
        return weight / (height * height); // 問題7: インスタンスのBMIを返す
    }

    // 問題8: インスタンスの情報を表示するメソッド
    void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "才です");
        System.out.printf("BMIは%.2fです\n", this.bmi()); // BMIを小数点以下2桁で表示
    }

    // 問題10: 合計人数をカウントする静的フィールド
    private static int count = 0;

    // コンストラクタで人数をカウント
    {
        count++;
    }

    // 合計人数を表示するメソッド
    static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}


