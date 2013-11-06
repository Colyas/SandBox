package cos.examples.thread;

public class MyThreadExt extends Thread {

	public void run() {
		System.out.println("Hello extend Thread");
	}

	public static void main(String[] args) {
		MyThreadExt ext = new MyThreadExt();
		ext.start();

	}

}
