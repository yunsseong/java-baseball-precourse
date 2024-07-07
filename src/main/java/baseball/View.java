package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class View {
	private String userInput;

	public void print(String message) {
		System.out.print(message);
	}

	public void println(String message) {
		System.out.println(message);
	}

	public void printResult(List<Integer> resultList) {
		Integer ball = resultList.get(0);
		Integer strike = resultList.get(1);

		if (ball == 0 && strike == 0) {
			println("낫싱");
			return;
		}

		StringBuilder stringBuilder = new StringBuilder();
		if (ball != 0) {
			stringBuilder.append(ball).append("볼");
			if (strike != 0) {
				stringBuilder.append(" ").append(strike).append("스트라이크");
			}
		} else {
			stringBuilder.append(strike).append("스트라이크");
		}
		println(stringBuilder.toString());

	}

	public String input(String message, Boolean printLine) {
		if (printLine)
			println(message);
		else
			print(message);
		return Console.readLine();
	}
}
