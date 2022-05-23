package assigment;
import java.text.DecimalFormat;
import java.util.Scanner;
public class question3 {
	private static final String[] tensValues = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	private static final String[] numValues = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	private static String convertSmallerThanThousand(int number) {
		String soFar;

		if (number % 100 < 20) {
			soFar = numValues[number % 100];
			number /= 100;
		} else {
			soFar = numValues[number % 10];
			number /= 10;

			soFar = tensValues[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0)
			return soFar;
		return numValues[number] + " hundred" + soFar;
	}

	public static String convert(long number) {
		if (number == 0) {
			return "zero";
		}

		String snumber = Long.toString(number);

		
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		
		int billions = Integer.parseInt(snumber.substring(0, 3));
	
		int millions = Integer.parseInt(snumber.substring(3, 6));
	
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
	
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1:
			tradBillions = convertSmallerThanThousand(billions) + " billion ";
			break;
		default:
			tradBillions = convertSmallerThanThousand(billions) + " billion ";
		}
		String result = tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = convertSmallerThanThousand(millions) + " million ";
			break;
		default:
			tradMillions = convertSmallerThanThousand(millions) + " million ";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = "one thousand ";
			break;
		default:
			tradHundredThousands = convertSmallerThanThousand(hundredThousands) + " thousand ";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertSmallerThanThousand(thousands);
		result = result + tradThousand;
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number/ Amount : ");
		String result = convert(scan.nextLong()) + " Dollar";
		System.out.println(result);

	}

}
