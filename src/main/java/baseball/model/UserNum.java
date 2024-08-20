package baseball.model;

import java.util.List;

import baseball.util.Util;
import baseball.view.Input;
import baseball.view.Message;
import baseball.view.Output;

public class UserNum {

	public List<Integer> userNumList;

	public UserNum(){
		userNumList = generateUserNum();
	}

	public List<Integer> getUserNumList() {
		return userNumList;
	}

	private List<Integer> generateUserNum(){
		Output.print(Message.INPUT_NUMBER);
		String userInput = Input.scanner();
		if (numValidation(userInput))
			throw new IllegalArgumentException();
		return Util.stringToIntegerList(userInput);
	}

	private boolean numValidation(String userInput) {
		return Validation.isEmpty(userInput) || Validation.isNotDigit(userInput) || Validation.isNotRightCount(userInput);
	}

}
