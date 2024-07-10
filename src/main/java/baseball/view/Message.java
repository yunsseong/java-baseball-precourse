package baseball.view;

import java.util.List;
import java.util.regex.Pattern;

import camp.nextstep.edu.missionutils.Console;

public class Message {
	private final Pattern digitPattern = Pattern.compile("^[1-9]*$");

	public void print(String message) {
		System.out.print(message);
	}

	public void println(String message) {
		System.out.println(message);
	}

	public String scanner() {
		return Console.readLine();
	}

	public String validateUserNum(String userNum) throws IllegalArgumentException {
		if (userNum.isEmpty())
			throw new IllegalArgumentException();
		if (userNum.length() != 3)
			throw new IllegalArgumentException();
		if (!digitPattern.matcher(userNum).matches())
			throw new IllegalArgumentException();
		return userNum;
	}

	public String validateUserIntention(String userIntention) {
		if (userIntention.isEmpty())
			throw new IllegalArgumentException();
		if (userIntention.length() != 1)
			throw new IllegalArgumentException();
		if (!digitPattern.matcher(userIntention).matches())
			throw new IllegalArgumentException();
		return userIntention;
	}

	public void printResult(List<Integer> result) {
		int ballCount = result.get(0);
		int strikeCount = result.get(1);

		if (ballCount == 0 && strikeCount == 0)
			this.print("낫싱");

		if (ballCount != 0 && strikeCount == 0)
			this.print(String.format("%d볼", ballCount));

		if (ballCount == 0 && strikeCount != 0)
			this.print(String.format("%d스트라이크", strikeCount));

		if (ballCount != 0 && strikeCount != 0)
			this.print(String.format("%d볼 %d스트라이크", ballCount, strikeCount));
	}
}
