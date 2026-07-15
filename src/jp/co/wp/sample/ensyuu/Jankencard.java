package jp.co.wp.sample.ensyuu;

import java.util.Scanner;

public class Jankencard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*******************");
		System.out.println("じゃんけんをしましょう！");
		System.out.println("*******************");
		System.out.println("3つから選択してください(g:グー、c:チョキ、p:パー)>");
		
		String playerInput = scanner.nextLine();
		
		System.out.println("あなたの入力:" + playerInput);
		
		scanner.close();
	}

}
