package curriculum_B;

public class Qes5 {
	
	    public static void main(String[] args) {
	        // 二重のfor文を使って掛け算表を表示する
	        for (int i = 1; i <= 20; i++) {
	            for (int j = 1; j <= 20; j++) {
	                // 各結果をフォーマットして出力
	                System.out.printf("%02d * %02d = %03d", i, j, i * j);

	                // 各列の間に区切りを入れるが、最後の列には入れない
	                if (j < 20) {
	                    System.out.print(" || ");
	                }
	            }
	            // 各行が終わったら改行
	            System.out.println();
	        }
	    }
	}



