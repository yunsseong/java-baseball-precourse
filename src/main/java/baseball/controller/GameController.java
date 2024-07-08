package baseball.controller;

import baseball.model.ComputerNumGenerator;
import baseball.view.Message;

public class GameController {
	private final ComputerNumGenerator computerNumGenerator;
	private final Message message;

	public GameController() {
		this.computerNumGenerator = new ComputerNumGenerator();
		this.message = new Message();
	}

	public void init() {
		computerNumGenerator.generateComputerNum();
	}
}
