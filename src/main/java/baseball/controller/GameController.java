package baseball.controller;

import java.util.List;

import baseball.model.ComputerNum;
import baseball.view.Message;

public class GameController {
	private final ComputerNum computerNum;
	private final Message message;

	public GameController() {
		this.computerNum = new ComputerNum();
		this.message = new Message();
	}

	public void init() {
		computerNum.generateNumList();
	}

	public void run() {
		message.print("숫자를 입력해주세요 : ");
		String userNum = message.validateUserNum(message.scanner());
		List<Integer> compareResultList = computerNum.compareNum(userNum);
	}
}
