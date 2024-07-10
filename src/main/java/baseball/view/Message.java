package baseball.view;

import java.util.regex.Pattern;

import camp.nextstep.edu.missionutils.Console;

public class Message {
	private final Pattern digitPattern = Pattern.compile("^[a-zA-Z]*$");

	public void print(String message) {
		System.out.print(message);
	}

	public void println(String message) {
		System.out.println(message);
	}

	public String scanner() {
		return Console.readLine();
	}

	public String validateUserNum(String userNum) throws IllegalArgumentException{
		if(userNum.isEmpty())
			throw new IllegalArgumentException();
		if(userNum.length() != 3)
			throw new IllegalArgumentException();
		if(!digitPattern.matcher(userNum).matches())
			throw new IllegalArgumentException();
		return userNum;
	}
}
