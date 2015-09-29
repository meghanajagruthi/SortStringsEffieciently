import java.util.HashMap;
import java.util.Map;

public class Iternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("Chennai", "Banglore");
		dataSet.put("Bombay", "Delhi");
		dataSet.put("Goa", "Chennai");
		dataSet.put("Delhi", "Goa");

		

		Map<String, String> reverseMap = new HashMap<String, String>();

		for (Map.Entry<String, String> entry : dataSet.entrySet()) {
			reverseMap.put(entry.getValue(), entry.getKey());
		}

		
		String start = null;
		for (Map.Entry<String, String> entry : dataSet.entrySet()) {
			if (!reverseMap.containsKey(entry.getKey())) {
				start = entry.getKey();
				break;
			}

		}

		if (start == null) {

			System.out.println("No chain is present");
			return;
		}

		String to = dataSet.get(start);

		while (to != null) {

			System.out.println(start + "   ->   " + to);
			start = to;
			to = dataSet.get(to);
		}

	}

}
