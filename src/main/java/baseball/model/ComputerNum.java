package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNum {
	private List<Baseball> baseballList = new ArrayList<>();

	public void generateComputerNum(){
		for(int num : generateUniqueNumList(3))
			baseballList.add(new Baseball(num));
	}

	public List<Integer> generateUniqueNumList(int count){
		List<Integer> numList = new ArrayList<>();
		do {
			numList.add(Randoms.pickNumberInRange(1, 9));
		} while (numList.stream().distinct().count() != count);
		return numList.stream().distinct().collect(Collectors.toList());
	}
}
