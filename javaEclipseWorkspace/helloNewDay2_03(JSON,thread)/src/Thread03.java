class ThreadWithRunnable3 implements Runnable{	
	// 웬만하면 인터페이스를 구현해서 사용
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

public class Thread03 {

	public static void main(String[] args) {
		Thread thread0 = new Thread(new ThreadWithRunnable3());
		thread0.start();
		System.out.println(thread0.getThreadGroup());
		
		ThreadGroup group = new ThreadGroup("myThread"); // 스레드 그룹을 생성합니다.
		group.setMaxPriority(7);						// 그룹의 최대 우선순위를 7로 설정
		
		// 스레드를 생성할 때 포함될 스레드 그룹을 전달할 수 있습니다.
		Thread thread1 = new Thread(new ThreadWithRunnable3());
		thread1.start();
		System.out.println(thread1.getThreadGroup());
			//java.lang.ThreadGroup[name=main,maxpri=20]
			//java.lang.ThreadGroup[name=myThread,maxpri=7]
	}

}
