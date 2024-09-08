package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ユーザー名の入力とチェック
        System.out.print("ユーザー名を入力してください: ");
        String username = scanner.nextLine();
        
        if (username == null || username.length() == 0) {
            System.out.println("名前を入力してください");
            System.exit(0);  // プログラムを終了
        } else if (username.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
            System.exit(0);  // プログラムを終了
        } else if (!username.matches("[a-zA-Z0-9]+")) { // 半角英数字のみをチェック
            System.out.println("半角英数字のみで名前を入力してください");
            System.exit(0);  // プログラムを終了
        } else {
            System.out.println("ユーザー名「" + username + "」を登録しました");
        }
        
        // じゃんけんシステムの起動
        startJanken(scanner, username);
        
        scanner.close();
    }

    public static void startJanken(Scanner scanner, String username) {
        Random random = new Random();
        String[] hands = {"グー", "チョキ", "パー"};
        int userHand, computerHand;
        int attemptCount = 0;
        
        while (true) {
            System.out.print(username + "の手を選んでください (0:グー, 1:チョキ, 2:パー): ");
            userHand = scanner.nextInt();
            computerHand = random.nextInt(3);
            attemptCount++;
            
            System.out.println(username + "の手は「" + hands[userHand] + "」");
            System.out.println("相手の手は「" + hands[computerHand] + "」");
            
            if (userHand == computerHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
            } else if ((userHand == 0 && computerHand == 1) ||
                       (userHand == 1 && computerHand == 2) ||
                       (userHand == 2 && computerHand == 0)) {
                System.out.println("やるやん。次は俺にリベンジさせて");
                break;
            } else {
                System.out.println("俺の勝ち！");
                if (computerHand == 0) {
                    System.out.println("負けは次につながるチャンスです！ネバーギブアップ！");
                } else if (computerHand == 1) {
                    System.out.println("たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");
                } else {
                    System.out.println("なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
                }
            }
        }
        
        System.out.println("勝つまでにかかった合計回数は" + attemptCount + "回です");
    }
}
