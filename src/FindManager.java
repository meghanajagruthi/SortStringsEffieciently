import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class FindManager {

	public static HashMap<String, Integer> result = new HashMap<String, Integer>();

	public static int increment(String key,
			Map<String, ArrayList<String>> managerMap) {
		int count = 0;
		if (!managerMap.containsKey(key)) {
			result.put(key, 0);
		}
		if (result.containsKey(key)) {
			count = result.get(key);
		} else {
			ArrayList<String> temp = managerMap.get(key);
			count = temp.size();
			for (String s : temp) {
				count += increment(s, managerMap);
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("A", "C");
		dataSet.put("B", "C");
		dataSet.put("C", "F");
		dataSet.put("D", "E");
		dataSet.put("E", "F");
		dataSet.put("F", "F");

		Map<String, ArrayList<String>> reverseMap = new HashMap<String, ArrayList<String>>();

		for (Map.Entry<String, String> entry : dataSet.entrySet()) {
			if (!entry.getKey().equalsIgnoreCase(entry.getValue())) {
				ArrayList<String> temp = new ArrayList<String>();
				if (reverseMap.containsKey(entry.getValue())) {
					temp = reverseMap.get(entry.getValue());
					temp.add(entry.getKey());
					reverseMap.put(entry.getValue(), temp);
				} else {
					temp.add(entry.getKey());
					reverseMap.put(entry.getValue(), temp);
				}
			}
		}
		for (String entry : dataSet.keySet()) {
			System.out.print(entry + "  --  ");
			System.out.println(increment(entry, reverseMap));
		}

	}

}
