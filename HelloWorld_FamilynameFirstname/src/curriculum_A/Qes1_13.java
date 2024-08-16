package curriculum_A;

public class Qes1_13 {

    public static void main(String[] args) {
        // 1. ローカル変数の宣言
        byte byteVar;
        short shortVar;
        int intVar;
        long longVar;

        double doubleVar;

        char charVar;
        String stringVar;

        boolean booleanVar;

        // 2. 初期化
        byteVar = 0;
        shortVar = 0;
        intVar = 0;
        longVar = 0L;

        doubleVar = 0.0;

        charVar = '\u0000';
        
        // string型の初期値修正
        stringVar = null;

        booleanVar = false;

        // 3. 値の代入
        byteVar = 10;
        shortVar = 100;
        intVar = 1000;
        longVar = 10000L;

        doubleVar = 10.5;

        charVar = 'a';
        stringVar = "ハロー";

        booleanVar = true;

        // 4. コンソール出力
        // 11110を2回
        int sum1 = byteVar + shortVar + intVar + (int) longVar;
        System.out.println(sum1 + "\t" + sum1);

        // 20を2回
        int doubleByteVar = byteVar * 2;
        System.out.println(doubleByteVar + "\t" + doubleByteVar);

        // 'a ハロー true'を2回
        System.out.println(charVar + " " + stringVar + " " + booleanVar + "\t" + charVar + " " + stringVar + " " + booleanVar);

        // 11130を2回（11110 + 20）
        int sum2 = sum1 + doubleByteVar;
        System.out.println(sum2 + "\t" + sum2 + "\t数字を全て足す");

        // 10000000000を2回（10 * 100 * 1000 * 10000）
        long product = byteVar * shortVar * intVar * longVar;
        System.out.println(product + "\t" + product + "\t小数点以外の数字を全てかける");

        // 0.105を2回（10.5 / 100）
        double division = doubleVar / shortVar;
        System.out.println(division + "\t" + division + "\t10.5割る100をする");

        // -90を2回（10 - 100）
        int subtraction = byteVar - shortVar;
        System.out.println(subtraction + "\t" + subtraction + "\t10引く100をする");

        // 5. 修正
        String num = "20";
        int num1 = 23;
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));

        // 6. フォーマット代入
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // 7. BMI
        double bmi = weight / ((height / 100) * (height / 100));
        System.out.println("BMIは" + bmi + "です");

        // 8. 再代入
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";

        bmi = weight / ((height / 100) * (height / 100));

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + bmi + "です");

        // 9. 自己代入
        age *= 2;
        height *= 2;
        weight *= 2;

        bmi = weight / ((height / 100) * (height / 100));

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + bmi + "です");

        // 年齢を再度24に設定
        age = 24;

        // 10. 年齢が25歳以上ならtrue（if文を使用しない）
        System.out.println(age >= 25);

        // 11. 年齢・身長・体重を文字列型に変換
        String ageStr = Integer.toString(age);
        String heightStr = Double.toString(height);
        String weightStr = Double.toString(weight);
        System.out.println(ageStr + heightStr + weightStr);

        // 12. 年齢・身長を整数型に変換
        int ageInt = Integer.parseInt(ageStr);
        int heightInt = (int) Double.parseDouble(heightStr);
        System.out.println(ageInt);
        System.out.println(heightInt);

        // 13. 年齢が25もしくは身長が160以上であればtrue（if文を使用しない）
        System.out.println(ageInt >= 25 || heightInt >= 160);
    }
}
