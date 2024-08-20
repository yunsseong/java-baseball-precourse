package baseball.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Util {

	public static List<Integer> stringToIntegerList(String userInput) {
		return userInput.chars()
			.mapToObj(Character::getNumericValue)
			.collect(Collectors.toList());
	}
}
