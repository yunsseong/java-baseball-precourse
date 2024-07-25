package baseball;

import baseball.controller.GameController;

public class Application {
	public static void main(String[] args) {
		GameController gameController = new GameController();
		do {
			gameController.init();
			gameController.run();
		} while (gameController.restart());

	}
}
