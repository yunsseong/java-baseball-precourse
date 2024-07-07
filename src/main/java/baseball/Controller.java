package baseball;

import java.util.List;

public class Controller {
	private static Controller controller;
	private final Model model;
	private final View view;

	private Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public static Controller getController(Model model, View view) {
		if (controller == null)
			controller = new Controller(model, view);
		return controller;
	}

	public void setting() {
		model.generateNumber();
	}

	public void validate(String value) throws IllegalArgumentException {
		if (value.length() != 3)
			throw new IllegalArgumentException();
	}

	public boolean statusCheck(Integer strike) {
		return strike == 3;
	}

	public boolean userDecisionCheck() {
		String userDecision = view.input("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.", true);
		return userDecision.equals("1");
	}

	public void play() {
		String userInput = view.input("숫자를 입력해주세요 : ", false);
		try {
			validate(userInput);
		} catch (Exception e) {
			System.exit(0);
		}

		List<Integer> result = model.generateHint(userInput);
		view.printResult(result);

		boolean isGameEnd = statusCheck(result.get(1));
		if (isGameEnd) {
			view.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
			if (userDecisionCheck()) {
				setting();
			} else {
				System.exit(0);
			}
		}
		play();
	}
}
