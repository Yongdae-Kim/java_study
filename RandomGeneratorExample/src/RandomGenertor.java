import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomGenertor {

	public static void main(String[] args) {

		String[] myArray = new String[] { "a", "b", "c", "d", "e", "f", "g" };
		List<String> myRandom = new ArrayList(Arrays.asList(myArray));
		// array to arrayList

		for (int i = 0; i < myArray.length; i++) {

			int randomNum = (int) (Math.random() * myRandom.size());

			System.out.println("get : " + myRandom.get(randomNum));
			System.out.println("remove : " + myRandom.remove(randomNum));
			// deduplication
			System.out.println(myRandom);

			if (myRandom.size() == 0) {
				System.out.println("nothing");
				// need to reassignment
			}
		}
	}
}
