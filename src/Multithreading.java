public class Multithreading extends Thread {

	private int id;
	private static int  totalCount=0;

	public Multithreading(int id) {
		super();
		this.id = id;
	}

	public void mtCount() {
		for (int i = 0; i < 20; i++) {
			System.out.printf("Hello from %d! Just counted to: %d, total count: %d\n", id, i,totalCount);
			increaseCount();
		}
	}

	public void run() {
		mtCount();
	}
public synchronized void increaseCount(){
	totalCount++;
}
	public static void main(String[] args) throws InterruptedException {
		Multithreading [] mt= new Multithreading [5];
		
		for (int i = 0; i < 5; i++) {
			mt[i]= new Multithreading(i);
			mt[i].start();
		}
		for(Multithreading meh: mt){
			meh.join();
		}
		System.out.println("Gotovo");

	}
}
