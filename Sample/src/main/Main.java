package main;

import java.util.Scanner;

import character.PlayerCharacter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        PlayerCharacter player = new PlayerCharacter(name);
        player.printStatus();

        scanner.close();  
    }
}
