package simple;

public class TestThread {

	public static void main(String[] args) {

		MiThread m = new MiThread("hilo1");		
		m.start();
		
		MiThread m2 = new MiThread("hilo2");
		m2.start();
		
		System.out.println("****** FIN ******");
		
	}
	
	public static class MiThread extends Thread {

		private String name;
		
		public MiThread(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			for(int i = 0; i < 1000; i++) {
				System.out.println(name + ": " + i);
			}
		}
		
		
		
		
	}

}
