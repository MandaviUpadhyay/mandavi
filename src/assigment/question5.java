package assigment;
import java.util.Scanner;
public class question5 {
	static void convertOpposite(StringBuffer str) {
		int ln = str.length();

		for (int i = 0; i < ln; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c))
				str.replace(i, i + 1, Character.toUpperCase(c) + "");
			else
				str.replace(i, i + 1, Character.toLowerCase(c) + "");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		StringBuffer Bf = new StringBuffer();
		Bf.append(str);
		convertOpposite(Bf);

		System.out.println(Bf);
	}

}
