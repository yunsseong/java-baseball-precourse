package baseball.controller;

import baseball.model.ComputerNum;
import baseball.view.Message;

public class GameController {
	private final Message message = new Message();
	private final ComputerNum computerNum = new ComputerNum();
	public void init() {
		computerNum.generateComputerNum();
	}
}
