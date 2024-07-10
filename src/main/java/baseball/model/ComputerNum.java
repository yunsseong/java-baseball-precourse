package baseball.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNum {
	private List<Integer> computerNum = new ArrayList<>();
	public void generateNumList() {
		do {
			Integer randomNum = Randoms.pickNumberInRange(1, 9);
			if (!computerNum.contains(randomNum))
				computerNum.add(randomNum);
		} while (computerNum.size() != 3);
	}
}
