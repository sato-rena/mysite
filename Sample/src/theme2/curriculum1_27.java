package theme2;

import java.util.Scanner;

public class curriculum1_27 {
    public static void main(String[] args) {
        // 動物情報
        String input = "ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50";
        String[] animalsData = input.split(",");

        // コンソール入力
        System.out.println("動物情報を入力してください（例: ライオン:2.1:80）:");
        
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();  // ユーザーから動物情報を入力

        // 動物情報を出力
        boolean found = false;
        for (String data : animalsData) {
            if (data.equals(userInput)) {
                String[] attributes = data.split(":");
                String name = attributes[0];
                double length = Double.parseDouble(attributes[1]);
                int speed = Integer.parseInt(attributes[2]);
                String scientificName = getScientificName(name);
                
                printInfo(name, length, speed, scientificName);
                found = true;
                break;  
            }
        }
        
        // 動物が見つからなかった場合のメッセージ
        if (!found) {
            System.out.println("指定された動物情報は見つかりませんでした。");
        }

        scanner.close();
    }

    private static String getScientificName(String name) {
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            case "インコ":
                return "不明";
            default:
                return "不明";
        }
    }

    private static void printInfo(String name, double length, int speed, String scientificName) {
        System.out.println("動物名：" + name);
        System.out.println("体長：" + length + "m");
        System.out.println("速度：" + speed + "km/h");
        System.out.println("学名：" + scientificName);
        System.out.println(); 
    }
}
