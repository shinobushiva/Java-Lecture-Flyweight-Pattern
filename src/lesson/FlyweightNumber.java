package lesson;

public class FlyweightNumber {
	private int num;

	public FlyweightNumber(int num) {
		this.num = num;
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getNum() {
		return num;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
