package java8;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("UAE", "United Arab Emirat");
		map.put("INDI", "India");
		map.put("KSA", "Kingdom of Saudi Arabia");
		map.put("USA", "United Arab Emirat");

		// System.out.println(map.get("UAE"));

		for (Map.Entry<String, String> itr : map.entrySet()) {
//			if(itr.getKey().equals("UAE")) {
//				System.out.println(itr.getValue());
//			}
			if (itr.getKey().length() <= 3) {
				System.out.println(itr.getValue());
			}
		}

	}

}
