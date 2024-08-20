package baseball.controller;

import static baseball.controller.Constant.*;

import baseball.model.ComputerNum;
import baseball.model.UserDecision;
import baseball.model.UserNum;
import baseball.view.Message;
import baseball.view.Output;

public class Controller {

	private final ComputerNum computerNum = new ComputerNum();

	public void init() {
		computerNum.generateComputerNum();
	}

	public void run(){
		int result = 0;
		do {
			UserNum userNum = new UserNum();
			result = computerNum.result(userNum.getUserNumList());
		} while (result != NUMBER_COUNT);
		Output.println(Message.END_SET_GAME);
	}

	public boolean restart() {
		UserDecision userDecision = new UserDecision();
		return userDecision.getUserDecision().equals(RESTART);
	}
}
