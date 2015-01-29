public class PrimeCounter extends Thread {
	private int start;
	private int end;
	private static int counter = 0;

	public void run() {
		checkPrime(start, end);
	}

	public PrimeCounter(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	private void checkPrime(int start, int end) {
		int check = 10000;
		for (int i = start; i < end; i++) {
			if (start == check) {
				System.out.println("Stigao do " + start);
				check += check;
			}

			int brojac = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					brojac++;
			}
			if (brojac == 0) {
				counter++;
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		int numThreads=5;
		PrimeCounter []test = new PrimeCounter[numThreads];
		long startTime = System.currentTimeMillis();
		int start =0;
		int end=2000000;
		int step= (end-start)/numThreads;
		for (int i = 0; i < 5; i++) {
			test[i]= new PrimeCounter(start+i*step,start+(i+1)*step);
			test[i].start();
		}
		for(PrimeCounter meh: test){
			meh.join();
		}
		long endTime = System.currentTimeMillis();

		System.out.println("Seconds: " + (double) (endTime - startTime) / 1000);
		System.out.println("Prime numbers: " + counter);
	}

}
