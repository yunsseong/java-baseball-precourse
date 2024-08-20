package baseball.view;

public class Output {

	public static void print(String message) {
		System.out.print(message);
	}

	public static void println(String message) {
		System.out.println(message);
	}

	public static void printResult(int ballCount, int strikeCount) {
		if(ballCount == 0 && strikeCount == 0)
			System.out.println("낫싱");
		if(ballCount > 0 && strikeCount == 0)
			System.out.println(ballCount+"볼");
		if(ballCount == 0 && strikeCount > 0)
			System.out.println(strikeCount+"스트라이크");
		if(ballCount > 0 && strikeCount > 0)
			System.out.println(ballCount+"볼 "+strikeCount+"스트라이크");
	}
}
