public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ster = "Happy independence day";
		StringBuilder str = new StringBuilder(ster.length());
		String words[] = ster.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			str.append(words[i]).append(' ');
		}
		str.setLength(str.length()-1);
		System.out.println(str);
	}

}
