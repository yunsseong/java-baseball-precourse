package baseball.controller;

import baseball.model.ComputerNumGenerator;
import baseball.view.Message;
import baseball.view.MessagePrinter;
import baseball.view.MessageScanner;

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

	public void run() {
		message.print("숫자를 입력해주세요 : ");
		String userNum = message.validateUserNum(message.scanner());

	}
}
