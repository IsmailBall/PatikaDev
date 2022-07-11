import java.util.ArrayList;

public class Race implements Runnable {

	private int id;

	private static ArrayList<Integer> numbersArrayList = fulfillList();
	private static ArrayList<Integer> evenNumbers = new ArrayList<Integer>(5000);
	private static ArrayList<Integer> oddNumbers = new ArrayList<Integer>(5000);
	private static Object LOCK = new Object();

	public Race(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run() {

		synchronized (LOCK) {
			for (int i = 2500 * (this.id - 1); i < this.id * 2500; i++) {

				if (numbersArrayList.get(i) % 2 == 0)
					evenNumbers.add(numbersArrayList.get(i));
				else {
					oddNumbers.add(numbersArrayList.get(i));
				}
			}
		}
	}

	private static ArrayList<Integer> fulfillList() {

		var numbers = new ArrayList<Integer>(10000);
		for (int i = 0; i < 10000; i++) {
			numbers.add(i);
		}
		return numbers;
	}

	public static void printToHundred() {

		System.out.println("Evens: ");
		for (Integer integer : evenNumbers) {
			if (evenNumbers.indexOf(integer) == 100)
				break;

			System.out.println(integer + " ");
		}

		System.out.println("Odds:");
		for (Integer integer : oddNumbers) {
			if (oddNumbers.indexOf(integer) == 100)
				break;
			System.out.println(integer + " ");
		}
	}

}
