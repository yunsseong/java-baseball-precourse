package baseball.model;

import baseball.view.Input;
import baseball.view.Message;
import baseball.view.Output;

public class UserDecision {

	private Integer userDecision;

	public UserDecision() {
		this.userDecision = generateUserDecision();
	}

	public Integer getUserDecision() {
		return userDecision;
	}

	private Integer generateUserDecision() {
		Output.println(Message.INPUT_USER_DECISION);
		String userInput = Input.scanner();
		if(decisionValidation(userInput))
			throw new IllegalArgumentException();
		return Integer.parseInt(userInput);
	}

	private boolean decisionValidation(String userInput) {
		return Validation.isEmpty(userInput) || Validation.isNotDigit(userInput) || Validation.isNotDecisionNum(userInput);
	}
}
