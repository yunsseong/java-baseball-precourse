package baseball.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNum {
	private List<Baseball> baseballList = new ArrayList<>();

	public void generateComputerNum() {
		for (int num : generateUniqueNumList(3))
			baseballList.add(new Baseball(num));
	}

	public List<Integer> generateUniqueNumList(int count) {
		List<Integer> numList = new ArrayList<>();
		do {
			numList.add(Randoms.pickNumberInRange(1, 9));
		} while (numList.stream().distinct().count() != count);
		return numList.stream().distinct().collect(Collectors.toList());
	}

	public List<Integer> getResult(String userNums) {
		List<Integer> userNumList = stringToIntegerList(userNums);
		int ballCount = getBallCount(userNumList);
		int strikeCount = getStrikeCount(userNumList);
		return new ArrayList<>(Arrays.asList(ballCount - strikeCount, strikeCount));
	}

	private List<Integer> stringToIntegerList(String string) {
		return Arrays.asList(string.split(""))
			.stream()
			.map(Integer::valueOf)
			.collect(Collectors.toList());
	}

	private int getBallCount(List<Integer> userNumList) {
		int ballCount = 0;
		for (Baseball baseball : baseballList){
			if (userNumList.contains(baseball.getDigit()))
				ballCount++;
		}
		return ballCount;
	}

	private int getStrikeCount(List<Integer> userNumList) {
		int strikeCount = 0;
		for (int i = 0; i < userNumList.size(); i++) {
			if (baseballList.get(i).isEqual(userNumList.get(i)))
				strikeCount++;
		}
		return strikeCount;
	}
}
