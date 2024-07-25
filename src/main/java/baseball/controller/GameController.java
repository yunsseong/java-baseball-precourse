package baseball.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import baseball.model.ComputerNum;
import baseball.view.Message;

public class GameController {
	private final Message message = new Message();
	private final ComputerNum computerNum = new ComputerNum();

	public void init() {
		computerNum.generateComputerNum();
	}

	public void run() {
		String userNums = "";
		List<Integer> result = new ArrayList<>();
		do {
			System.out.printf("숫자를 입력해주세요 : ");
			userNums = message.scanner();
			validateUserNum(userNums);
			result = computerNum.getResult(userNums);
			message.printResult(result);
		} while (result.get(1) != 3);
	}

	private void validateUserNum(String userNums) {
		if (isEmpty(userNums))
			throw new IllegalArgumentException();
		if (isNotDigit(userNums))
			throw new IllegalArgumentException();
		if (isNotCountRight(userNums))
			throw new IllegalArgumentException();
		if (isNotUnique(userNums))
			throw new IllegalArgumentException();
	}

	private boolean isEmpty(String userNums) {
		return userNums.isEmpty();
	}

	private boolean isNotDigit(String userNums) {
		for (String userNum : userNums.split(""))
			if (!Character.isDigit(userNum.charAt(0)))
				return true;
		return false;
	}

	private boolean isNotCountRight(String userNums) {
		return userNums.split("").length != 3;
	}

	private boolean isNotUnique(String userNums) {
		return Arrays.stream(userNums.split("")).distinct().count() != 3;
	}

}
