package baseball.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNum {
	private final List<Integer> computerNumList = new ArrayList<>();
	public void generateNumList() {
		do {
			Integer randomNum = Randoms.pickNumberInRange(1, 9);
			if (!computerNumList.contains(randomNum))
				computerNumList.add(randomNum);
		} while (computerNumList.size() != 3);
	}
	public List<Integer> stringToIntegerList(String string){
		return string.chars()
			.map(c -> c - '0')
			.boxed()
			.collect(Collectors.toList());
	}

	public List<Integer> compareNum(String userNum){
		int ballCount = 0;
		int strikeCount = 0;

		List<Integer> userNumList = stringToIntegerList(userNum);

		for(int i = 0; i < 3; i++){
			if(computerNumList.get(i).equals(userNumList.get(i)))
				strikeCount++;

			if(computerNumList.contains(userNumList.get(i)))
				ballCount++;
		}
		ballCount -= strikeCount;
		return new ArrayList<>(Arrays.asList(ballCount, strikeCount));
	}
}
