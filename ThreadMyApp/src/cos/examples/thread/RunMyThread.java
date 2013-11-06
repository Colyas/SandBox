package cos.examples.thread;

public class RunMyThread {

	static HelloThread helloThread;

	public static void main(String[] args) {
		helloThread = new HelloThread();
		Thread myThread = new Thread(helloThread);
		myThread.start();

	}

}
