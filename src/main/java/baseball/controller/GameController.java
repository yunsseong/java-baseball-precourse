package baseball.controller;

import java.util.List;

import baseball.model.ComputerNum;
import baseball.view.Message;

public class GameController {
	private final ComputerNum computerNum;
	private final Message message;
	private String userNum;
	private List<Integer> compareResultList;

	public GameController() {
		this.computerNum = new ComputerNum();
		this.message = new Message();
	}

	public void init() {
		computerNum.generateNumList();
	}

	public void run() {
		do {
			message.print("숫자를 입력해주세요 : ");
			userNum = message.validateUserNum(message.scanner());
			compareResultList = computerNum.compareNum(userNum);
			message.printResult(compareResultList);
		} while (isGameEnd(compareResultList));
	}

	public boolean isGameEnd(List<Integer> result){
		return !result.get(1).equals(3);
	}
}
