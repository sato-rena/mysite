package curriculum_B;

public class Qes4 {
	
	    public static void main(String[] args) {
	        // 二重のfor文を使って九九を表示する
	        for (int i = 1; i <= 9; i++) {
	            for (int j = 1; j <= 9; j++) {
	                // 各結果をフォーマットして出力
	                System.out.printf("%02d * %02d = %02d", i, j, i * j);
	                
	                // 各列の間に区切りを入れる
	                if (j < 9) {
	                    System.out.print(" || ");
	                }
	            }
	            // 各行が終わったら改行
	            System.out.println();
	        }
	    }
	}


