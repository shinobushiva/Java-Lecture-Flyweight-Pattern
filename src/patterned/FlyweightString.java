package patterned;

public class FlyweightString {
	private String str;

	public FlyweightString(String str) {
		this.setStr(str);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
