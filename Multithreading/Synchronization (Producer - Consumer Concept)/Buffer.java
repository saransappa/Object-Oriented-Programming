package synchronization;

// Using wait() and notify() methods makes the synchronization efficient and read/write operations occur in alternate fashion


public class Buffer {
	private int data;
	private boolean flag;
	
	public synchronized void write(int i) {
		
		try{
			while(flag) {
				wait();
			}
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		data = i;
		flag = true;
		System.out.println("P"+" "+data);
		notify();
	}
	
	public synchronized int read() {
		try{
			while(!flag) {
				wait();
			}
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("C"+" "+data);
		flag = false;
		notify();
		return data;
	}
}
