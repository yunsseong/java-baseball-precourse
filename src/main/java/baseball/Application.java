package baseball;

import baseball.controller.Controller;

public class Application {
	public static void main(String[] args) {
		Controller controller = new Controller();
		do {
			controller.init();
			controller.run();
		} while (controller.restart());
	}
}
