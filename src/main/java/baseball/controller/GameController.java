package baseball.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import baseball.model.ComputerNum;
import baseball.view.Message;

public class GameController {
	public static final int NUMBER_COUNT = 3;
	public static final String RESTART = "1";
	public static final String TERMINATE = "2";
	public static final int STRIKE = 1;
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
		} while (result.get(STRIKE) != NUMBER_COUNT);
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
	}

	public boolean restart() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		String userDecision = message.scanner();
		validateUserDecision(userDecision);
		return userDecision.equals(RESTART);
	}

	private void validateUserDecision(String userDecision) {
		if (isEmpty(userDecision))
			throw new IllegalArgumentException();
		if (isNotDigit(userDecision))
			throw new IllegalArgumentException();
		if (isNotDecisionNum(userDecision))
			throw new IllegalArgumentException();
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
		return userNums.split("").length != NUMBER_COUNT;
	}

	private boolean isNotUnique(String userNums) {
		return Arrays.stream(userNums.split("")).distinct().count() != NUMBER_COUNT;
	}

	private boolean isNotDecisionNum(String userDecision) {
		return !userDecision.equals(RESTART) && !userDecision.equals(TERMINATE);
	}
}
