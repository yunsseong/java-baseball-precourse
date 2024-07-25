package baseball.view;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;

public class Message {
	public String scanner(){
		return Console.readLine();
	}

	public void printResult(List<Integer> result) {
		int ballCount = result.get(0);
		int strikeCount = result.get(1);
		if(ballCount == 0 && strikeCount == 0)
			System.out.println("낫싱");
		if(ballCount > 0 && strikeCount == 0)
			System.out.println(ballCount+"볼");
		if(ballCount == 0 && strikeCount > 0)
			System.out.println(strikeCount+"스트라이크");
		if(ballCount > 0 && strikeCount > 0)
			System.out.println(ballCount+"볼 "+strikeCount+"스트라이크");
	}
}
