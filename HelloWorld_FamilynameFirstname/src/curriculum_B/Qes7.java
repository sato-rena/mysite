package curriculum_B;
import java.util.Scanner;
public class Qes7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 生徒の人数を入力
	        int numberOfStudents;
	        do {
	            System.out.print("生徒の人数を入力してください（2以上）: ");
	            numberOfStudents = scanner.nextInt(2);
	        } while (numberOfStudents < 2); // 2人以上であることを確認

	        // 各生徒の点数を保存するための配列
	        double[][] scores = new double[numberOfStudents][4]; // 4科目（英語、数学、理科、社会）

	        // 科目の名前
	        String[] subjects = {"英語", "数学", "理科", "社会"};

	        // 各生徒の点数入力
	        for (int i = 0; i < numberOfStudents; i++) {
	            System.out.println((i + 1) + "人目の点数を入力してください:");
	            for (int j = 0; j < 4; j++) {
	                System.out.print(subjects[j] + "の点数を入力してください: ");
	                scores[i][j] = scanner.nextDouble();
	            }
	        }

	        // 生徒ごとの平均点を計算・出力
	        double totalAverage = 0.0; // 全体の平均を計算するための変数
	        for (int i = 0; i < numberOfStudents; i++) {
	            double sum = 0.0;
	            for (int j = 0; j < 4; j++) {
	                sum += scores[i][j];
	            }
	            double average = sum / 4.0;
	            totalAverage += sum; // 全体の合計に追加
	            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), average);
	        }

	        // 各科目の平均点を計算・出力
	        for (int j = 0; j < 4; j++) {
	            double subjectSum = 0.0;
	            for (int i = 0; i < numberOfStudents; i++) {
	                subjectSum += scores[i][j];
	            }
	            double subjectAverage = subjectSum / numberOfStudents;
	            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], subjectAverage);
	        }

	        // 全体の平均点を計算・出力
	        totalAverage /= (numberOfStudents * 4); // 全体の点数の平均を計算
	        System.out.printf("全体の平均点は%.2f点です。\n", totalAverage);

	        scanner.close();
	    }
	}



