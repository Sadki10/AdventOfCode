import java.util.*;

public class day1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = "";
		int suma = 0;

		while (sc.hasNextLine() && !(input.isEmpty())) {

			input = sc.nextLine();
			if (!input.isEmpty()) {
				ArrayList<Character> llista = new ArrayList<>();
				for (int i = 0; i < input.length(); i++) {
					if (Character.isDigit(input.charAt(i))) {
						llista.add(input.charAt(i));
					}

				}

				char char0 = llista.get(0);

				char char1 = llista.get(llista.size() - 1);

				System.out.println(Character.toString(char0) + Character.toString(char1));
				int digitsConcatenats = Integer.parseInt(Character.toString(char0) + Character.toString(char1));
				suma += digitsConcatenats;
			}
		}
		System.out.println("La suma és: " + suma);
		sc.close();
	}

}
