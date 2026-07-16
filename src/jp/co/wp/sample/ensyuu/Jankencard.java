package jp.co.wp.sample.ensyuu;

import java.util.Scanner;

public class Jankencard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int playerWinCount = 0;

		System.out.println("*******************");
		System.out.println("じゃんけんをしましょう！");
		System.out.println("5回勝つと終了です。");
		System.out.println("*******************");

		while (playerWinCount < 5) {
			System.out.println();
			System.out.println("現在の勝利数:" + playerWinCount + "勝");
			System.out.println("3つから選択してください（g:グー、c:チョキ、p:パー）> ");

			String playerInput = scanner.nextLine();

			String playerHand = "";

			if (playerInput.equals("g")) {
				playerHand = "グー";
			} else if (playerInput.equals("c")) {
				playerHand = "チョキ";
			} else if (playerInput.equals("p")) {
				playerHand = "パー";
			} else {
				System.out.println("正しい文字を入力してください。");
				continue;
			}

			int computerNumber = (int) (Math.random() * 3);

			String computerHand = "";

			if (computerNumber == 0) {
				computerHand = "グー";
			} else if (computerNumber == 1) {
				computerHand = "チョキ";
			} else if (computerNumber == 2) {
				computerHand = "パー";
			}

			String result = "";

			if (playerHand.equals(computerHand)) {
				result = "→Draw";
			} else if (playerHand.equals("グー") && computerHand.equals("チョキ") ||
					playerHand.equals("チョキ") && computerHand.equals("パー") ||
					playerHand.equals("パー") && computerHand.equals("グー")) {
				result = "→You Win!";
				playerWinCount++;
			} else {
				result = "→You Lose...";
			}
			System.out.println("あなた:" + playerHand + " コンピューター:" + computerHand);
			System.out.println(result);
		}

		System.out.println();
		System.out.println("5勝しました！");
		System.out.println("じゃんけんを終了します。");

		scanner.close();
	}

}
