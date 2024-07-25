package baseball.model;

public class Baseball {
	private int digit;

	public Baseball(int digit){
		this.digit = digit;
	}

	public boolean isEqual(int num){
		return digit == num;
	}

	public int getDigit(){
		return digit;
	}

	@Override
	public String toString() {
		return "Baseball{" +
			"digit=" + digit +
			'}';
	}
}
