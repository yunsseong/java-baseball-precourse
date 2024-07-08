package baseball.model;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNumGenerator {
	private final List<Integer> numberList = new ArrayList<>();

	public void generateComputerNum() {
		do {
			Integer randomNum = Randoms.pickNumberInRange(1, 9);
			if (!numberList.contains(randomNum))
				numberList.add(randomNum);
		} while (numberList.size() != 3);
	}
}
