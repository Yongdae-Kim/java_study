import java.util.Scanner;
import java.util.Stack;

/**
 * 10진수를 입력 받아, 천(1000)자리 구분자를 추가하는 프로그램 
 * Sunny Kwak(sunnykwak@daum.net)
 */

public class DigitGrouping {

	public static void main(String[] args) {

		// 10진수값입력
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");

		int inputNumber = sc.nextInt();
		// 구분자를 추가한 후, 출력.
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
			// 몫과 나머지계산
			quotient = number / DECIMAL_NUMBER;
			spare = number % DECIMAL_NUMBER;

			// 몫을n에 재할당, 나머지는 스택에 추가
			number = quotient;
			digitStack.push(Character.forDigit(spare, 10));

			// 3개의 숫자를 추가했다면, 구분자를 버퍼에 추가
			if (++count == 3 && quotient > 0) {
				digitStack.push(THOUSANDS_SEPARATOR);
				count = 0;
			}
		} while (quotient > 0);
		// 스택에 저장된 숫자를 꺼내 문자열 버퍼에 추가

		while (!digitStack.empty()) {
			sb.append(digitStack.pop());
		}

		return sb.toString();
	}

	private static String digitGroupingByCharacterType(int number) {

		final char THOUSANDS_SEPARATOR = ',';

		StringBuilder sb = new StringBuilder();

		// 입력 숫자를 문자열 타입으로 변환
		String numberAsStr = String.valueOf(number);

		// 맨 앞부분에서 잘라낼 길이를 계산하고, 출력 버퍼에 담는다.
		int separationIndex = numberAsStr.length() % 3;
		sb.append(numberAsStr.substring(0, separationIndex));

		// 숫자의 나머지를 3자리씩 잘라서 구분자와 함께 추가한다.
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
