package synchronization;

public class Driver {
	public static void main(String [] args) {
		Buffer b = new Buffer();
		Producer p = new Producer(b);
		Consumer c = new Consumer(b);
		p.start();
		c.start();
		try {
			p.join();
			c.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
