package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

    // Q1: 引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド
    public static void printMessage(String str, int num) {
        System.out.println(str + " JavaSE " + num);
    }

    // Q2: 引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッド
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    // Q3: 引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    // Q4: Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力
    public static void multiply(double a, double b) {  // 同じメソッド名でオーバーロード
        System.out.println(a + b);
    }

    // Q5: 引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
    // 格納した値を順番にコンソールで出力後、格納した値を返すメソッド
    public static int[] generateRandomNumbers(int count) {
        Random rand = new Random();
        int[] numbers = new int[count];
        int index = 0;
        while (index < count) {
            int num = rand.nextInt(100) + 1; // 1〜100のランダムな値を生成
            if (num != 0) { // 0は無視
                numbers[index++] = num;
                System.out.println(num);
            }
        }
        return numbers;
    }

    // Q6: 引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッド
    public static void printAverage(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("配列が空です。");
            return;
        }
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.printf("平均値: %.2f\n", average);
    }

    // Q7: 引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力
    public static void checkAverage(double average) {
        boolean result = average >= 50;
        System.out.println(result);
    }

    public static void main(String[] args) {
        // Q1
        printMessage("Hello", 11);

        // Q2
        multiply(4, 5);

        // Q4（オーバーロードされたメソッドの呼び出し）
        multiply(2.5, 3.5);

        // Q3
        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);

        // Q5
        int[] randomNumbers = generateRandomNumbers(10);

        // Q6
        printAverage(randomNumbers);

        // Q7
        double average = calculateAverage(randomNumbers); // 平均値を計算するメソッドを呼び出す
        checkAverage(average);
    }

    // 平均値を計算するメソッドを追加
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
