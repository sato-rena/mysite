package theme_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import theme1.Prefecture;

public class Main {
    public static void main(String[] args) {
        Prefecture[] prefectures = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("数字をカンマ区切りで入力してください（例: 8,5,9）: ");
        String input = scanner.nextLine();
        String[] indices = input.split(",");

        System.out.print("昇順で表示しますか？(y/n): ");
        String order = scanner.nextLine();

        // 選択された都道府県を格納
        Prefecture[] selectedPrefectures = new Prefecture[indices.length];
        for (int i = 0; i < indices.length; i++) {
            int index = Integer.parseInt(indices[i]);
            selectedPrefectures[i] = prefectures[index];
        }

        // ソート
        Arrays.sort(selectedPrefectures, order.equalsIgnoreCase("y") 
            ? Comparator.comparing(Prefecture::getArea).reversed()  // yの場合は昇順
            : Comparator.comparing(Prefecture::getArea));          // nの場合は降順

        // 出力
        for (Prefecture p : selectedPrefectures) {
            System.out.println("都道府県名：" + p.getName());
            System.out.println("県庁所在地：" + p.getCapital());
            System.out.println("面積：" + p.getArea() + "km2\n");
        }

        scanner.close();
    }
}
