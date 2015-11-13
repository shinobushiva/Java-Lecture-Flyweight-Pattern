package patterned;

public class FlyweightStringTest {

	public static void main(String[] args) {

		String[] words = { "hello", "world", "super", "cat", "man", "what!?" };

		int num = 2000;
		long time = 0;

		time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			new FlyweightString(words[i % words.length]);
		}
		System.out.println("" + (System.currentTimeMillis() - time) + " ms");

		FlyweightStringFactory instance = FlyweightStringFactory.getInstance();
		time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			instance.create(words[i % words.length]);
		}
		System.out.println("" + (System.currentTimeMillis() - time) + " ms");

	}

}
