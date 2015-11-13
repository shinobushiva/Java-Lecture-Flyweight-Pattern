package lesson;

/**
 * 
 * [課題] FlyweightNumberに対してFlyweightパターンを使うことでインスタンス生成の回数を減らし
 * 負荷を少なくするプログラムを作成してください
 * 
 * 
 * @author shiva
 *
 */
public class FlyweightNumberTest {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5 };

		int num = 2000;
		long time = 0;

		time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			// 普通に new する場合
			// 数字は1~5がくり返し使われるようにしている
			new FlyweightNumber(ar[i % ar.length]);
		}
		System.out.println("" + (System.currentTimeMillis() - time) + " ms");

		time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			// Flyweightパターンを使ってインスタンスを取得するコードを書く
		}
		System.out.println("" + (System.currentTimeMillis() - time) + " ms");

	}

}
