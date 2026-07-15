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
		
		String playerHand = "";
		
		if(playerInput.equals("g")) {
			playerHand = "グー";
		}else if(playerInput.equals("c")) {
			playerHand = "チョキ";
		}else if(playerInput.equals("p")) {
			playerHand = "パー";
		}else {
			playerHand = "不正な入力";
		}
		
		System.out.println("あなた:" + playerHand);
		
		scanner.close();
	}

}
