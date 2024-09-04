import java.util.HashSet;
import java.util.Set;

public class VowelsAndConsonents {

	public static void main(String args[]) {

		String str = "The quick brown fox jumps over the lazy dog";

		int VowelCount = 0;
		
		Set<Character> charSet = new HashSet<>();

		str = str.replaceAll(" ", "").toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			charSet.add(c);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				VowelCount++;
			}
		}
		System.out.println("Vowels: " + VowelCount);
		System.out.println("Consonents: " +charSet.size());

	}

}
