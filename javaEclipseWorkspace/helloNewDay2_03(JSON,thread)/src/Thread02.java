class ThreadWithRunnable2 implements Runnable{	
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread02 {

	public static void main(String[] args) {
		// 스레드의 기본 우선순위는 5입니다.
		Thread thread0 = new Thread(new ThreadWithRunnable2());
		Thread thread1 = new Thread(new ThreadWithRunnable2());
		
		thread1.setPriority(10);
		
		thread0.start();
		thread1.start();
		
		System.out.println(thread0.getPriority());
		System.out.println(thread1.getPriority());

	}

}
