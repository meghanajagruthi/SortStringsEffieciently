public class RemoveSpecificChars {

	public static String removeSpecificChars(char original[],
			char toBeRemoved[]) {
		boolean array[] = new boolean[128];
		for (int i = 0; i < toBeRemoved.length; i++) {
			array[toBeRemoved[i]] = true;
		}
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < original.length; i++) {
			if (!array[original[i]])
				str.append(original[i]);
		}
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalStr = "Happy independence day";
		String charsToBeRemoved = "aeiou";
		System.out.println(removeSpecificChars(originalStr.toCharArray(),
				charsToBeRemoved.toCharArray()));
	}

}
