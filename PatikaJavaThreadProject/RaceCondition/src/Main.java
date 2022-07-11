

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Race race1 = new Race(1);
		Race race2 = new Race(2);
		Race race3 = new Race(3);
		Race race4 = new Race(4);
		
		Thread th1 = new Thread(race1);
		Thread th2 = new Thread(race2);
		Thread th3 = new Thread(race3);
		Thread th4 = new Thread(race4);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Race.printToHundred();
		int x = 5;
	}

}
