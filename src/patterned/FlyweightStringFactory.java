package patterned;

import java.util.HashMap;
import java.util.Map;

public class FlyweightStringFactory {
	private Map<String, FlyweightString> map = new HashMap<String, FlyweightString>();

	// シングルトン
	private final static FlyweightStringFactory instance = new FlyweightStringFactory();

	public static FlyweightStringFactory getInstance() {
		return instance;
	}

	public FlyweightString create(String str) {
		if (!map.containsKey(str))
			map.put(str, new FlyweightString(str));

		return map.get(str);
	}

}
