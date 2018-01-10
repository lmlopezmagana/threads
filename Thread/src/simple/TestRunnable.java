package simple;

public class TestRunnable {

	public static void main(String[] args) {

		MiRunnable m = new MiRunnable();
		Thread t = new Thread(m);
		t.start();
		
		System.out.println("****** FIN ******");
		
	}
	
	public static class MiRunnable implements Runnable {

		@Override
		public void run() {
			for(int i = 0; i < 1000000; i++) {
				System.out.println(i);
			}
		}
		
		
		
		
	}

}
