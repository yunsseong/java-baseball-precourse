package baseball.model;

import static baseball.model.Constant.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import baseball.view.Output;
import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNum {
	private List<Baseball> computerNumList = new ArrayList<>();

	public void generateComputerNum() {
		computerNumList = new ArrayList<>();
		for (int num : generateUniqueNumList(NUMBER_COUNT))
			computerNumList.add(new Baseball(num));
	}

	public List<Integer> generateUniqueNumList(int count) {
		List<Integer> numList = new ArrayList<>();
		do {
			numList.add(Randoms.pickNumberInRange(START_NUM, END_NUM));
		} while (numList.stream().distinct().count() != count);
		return numList.stream().distinct().collect(Collectors.toList());
	}

	public int result(List<Integer> userNumberList) {
		int ballCount = getBallCount(userNumberList);
		int strikeCount = getStrikeCount(userNumberList);
		Output.printResult(ballCount, strikeCount);
		return strikeCount;
	}

	private int getBallCount(List<Integer> userNumList) {
		int ballCount = 0;

		for (int i = 0; i < userNumList.size(); i++) {
			Integer compareNum = userNumList.get(i);
			if (!compareNum.equals(computerNumList.get(i).getDigit()) && contain(compareNum))
				ballCount++;
		}
		return ballCount;
	}

	private boolean contain(Integer compareNum) {
		for (Baseball baseball : computerNumList) {
			if(compareNum == baseball.getDigit())
				return true;
		}
		return false;
	}

	private int getStrikeCount(List<Integer> userNumList) {
		int strikeCount = 0;
		for (int i = 0; i < userNumList.size(); i++) {
			if (computerNumList.get(i).isEqual(userNumList.get(i)))
				strikeCount++;
		}
		return strikeCount;
	}
}
