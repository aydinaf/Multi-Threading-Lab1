
public class Worker extends Parent {
	int start, end;
	
	public Worker(int s, int e) {
		start = s;
		end = e;
	}
	
	@Override
	public void run() {
		synchronized (System.out) {
			System.out.println("Hi, I am thread " + Thread.currentThread().getName());
			for (int i = start; i < end; ++i) {
				System.out.print(i + " , ");
			}
			System.out.println("\n=====================");
		}
	}
}
