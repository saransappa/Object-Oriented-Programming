package synchronization;

public class Producer extends Thread {
	private Buffer buf;
	
	public Producer(Buffer b) {
		buf = b;
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			buf.write(i);
		}
	}
	
}
