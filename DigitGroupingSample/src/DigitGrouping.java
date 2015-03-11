import java.util.Scanner;
import java.util.Stack;

/**
 * 10������ �Է� �޾�, õ(1000)�ڸ� �����ڸ� �߰��ϴ� ���α׷� 
 * Sunny Kwak(sunnykwak@daum.net)
 */

public class DigitGrouping {

	public static void main(String[] args) {

		// 10�������Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");

		int inputNumber = sc.nextInt();
		// �����ڸ� �߰��� ��, ���.
		System.out.println("Output : " + digitGroupingByNumberType(inputNumber));
		System.out.println("Output : " + digitGroupingByCharacterType(inputNumber));

	}

	private static String digitGroupingByNumberType(int number) {

		final int DECIMAL_NUMBER = 10;
		final char THOUSANDS_SEPARATOR = ',';

		Stack<Character> digitStack = new Stack<Character>();

		StringBuilder sb = new StringBuilder();

		int quotient, spare, count = 0;

		do {
			// ��� ���������
			quotient = number / DECIMAL_NUMBER;
			spare = number % DECIMAL_NUMBER;

			// ����n�� ���Ҵ�, �������� ���ÿ� �߰�
			number = quotient;
			digitStack.push(Character.forDigit(spare, 10));

			// 3���� ���ڸ� �߰��ߴٸ�, �����ڸ� ���ۿ� �߰�
			if (++count == 3 && quotient > 0) {
				digitStack.push(THOUSANDS_SEPARATOR);
				count = 0;
			}
		} while (quotient > 0);
		// ���ÿ� ����� ���ڸ� ���� ���ڿ� ���ۿ� �߰�

		while (!digitStack.empty()) {
			sb.append(digitStack.pop());
		}

		return sb.toString();
	}

	private static String digitGroupingByCharacterType(int number) {

		final char THOUSANDS_SEPARATOR = ',';

		StringBuilder sb = new StringBuilder();

		// �Է� ���ڸ� ���ڿ� Ÿ������ ��ȯ
		String numberAsStr = String.valueOf(number);

		// �� �պκп��� �߶� ���̸� ����ϰ�, ��� ���ۿ� ��´�.
		int separationIndex = numberAsStr.length() % 3;
		sb.append(numberAsStr.substring(0, separationIndex));

		// ������ �������� 3�ڸ��� �߶� �����ڿ� �Բ� �߰��Ѵ�.
		while (separationIndex < numberAsStr.length()) {

			if (separationIndex > 0) {
				sb.append(THOUSANDS_SEPARATOR);
			}

			sb.append(numberAsStr.substring(separationIndex,
					separationIndex + 3));

			separationIndex += 3;
		}

		return sb.toString();
	}
}
