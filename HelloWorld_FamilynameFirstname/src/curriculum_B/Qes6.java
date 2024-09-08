package curriculum_B;

import java.util.Random;
public class Qes6 {

	    public static void main(String[] args) {
	        String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
	        String[] products = input.split("、");

	        Random random = new Random();

	        for (String product : products) {
	            int remaining = random.nextInt(12); // 0〜11のランダムな値を生成

	            switch (product) {
	                case "テレビ":
	                case "ディスプレイ":
	                    remaining = product.equals("ディスプレイ") ? 11 - remaining : remaining;
	                    System.out.println(product + "の残り台数は" + remaining + "台です");
	                    break;

	                case "パソコン":
	                    System.out.println("パソコンの残り台数は" + remaining + "台です");
	                    break;

	                case "冷蔵庫":
	                    System.out.println("冷蔵庫の残り台数は" + remaining + "台です");
	                    break;

	                case "扇風機":
	                    System.out.println("扇風機の残り台数は" + remaining + "台です");
	                    break;

	                case "洗濯機":
	                    System.out.println("洗濯機の残り台数は" + remaining + "台です");
	                    break;

	                case "加湿器":
	                    System.out.println("加湿器の残り台数は" + remaining + "台です");
	                    break;

	                default:
	                    System.out.println("『 " + product + " 』は指定の商品ではありません");
	            }
	        }
	    }
	}


