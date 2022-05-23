package assigment;

import java.util.Scanner;

public class question1 {

	public static Integer SplitTheNumber(String p) {
		String[] words = p.split(" ");
		Integer result = 0;

		if (words[1].contains("+")) {

			String[] splittedOnBases = words[1].split("\\+");
			result = Integer.parseInt(words[0].substring(0, splittedOnBases[0].length()))
					+ Integer.parseInt(words[0].substring(splittedOnBases[0].length()));
			return result;
		}
		if (words[1].contains("-")) {
			String[] splittedOnBases = words[1].split("-");
			result = Integer.parseInt(words[0].substring(0, splittedOnBases[0].length()))
					- Integer.parseInt(words[0].substring(splittedOnBases[0].length()));
			return result;

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the data : ");
		String pattern = scan.nextLine();

		System.out.println("Output is : " + SplitTheNumber(pattern));

	}
}
