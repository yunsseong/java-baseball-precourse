package baseball.model;

import static baseball.controller.Constant.*;

import java.util.Arrays;

public class Validation {
	public static boolean isEmpty(String userNums) {
		return userNums.isEmpty();
	}

	public static boolean isNotDigit(String userNums) {
		for (String userNum : userNums.split(""))
			if (!Character.isDigit(userNum.charAt(0)))
				return true;
		return false;
	}

	public static boolean isNotRightCount(String userNums) {
		return userNums.split("").length != NUMBER_COUNT;
	}

	public static boolean isNotUnique(String userNums) {
		return Arrays.stream(userNums.split("")).distinct().count() != NUMBER_COUNT;
	}

	public static boolean isNotDecisionNum(String userDecision) {
		return !userDecision.equals(RESTART) && !userDecision.equals(TERMINATE);
	}
}