class ThreadWithClass extends Thread{
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(getName());	// 현재 실행중인 스레드의 이름을 출력합니다.
			try {
				Thread.sleep(1000); // 스레드를 멈춤
				// 1000 = 1s 
			}catch (InterruptedException e) {
				// 배가고파서 라면을 끓이기 위해 물을 끓이고 있는데 택배가 와서 벨을눌러
				// 그럼 택배를 받고 라면을 끓일래 아님 라면 다 끓이고 택배를 받을래? (interrupt)
				e.printStackTrace();
			}
		}
	}
}

class ThreadWithRunnable implements Runnable{	
	// 웬만하면 인터페이스를 구현해서 사용
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread01 {

	public static void main(String[] args) {
		ThreadWithClass thread0 = new ThreadWithClass();
		Thread thread1 = new Thread(new ThreadWithRunnable());
		// 스레드 클래스를 만들고 그안에 생성자를 넣어 클래스를 동작.
		
		thread0.start();
		thread1.start();
	}
}
