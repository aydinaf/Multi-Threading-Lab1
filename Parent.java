public class Parent extends Thread {
	public int children;
	public int range;

	@Override
	public void run() {
		
		Worker[] workers = new Worker[children];
		for (int i = 0; i < children; i++) {
			int end = (i + 1) * range;
			int start = end - range;
			
			workers[i] = new Worker(start, end);
			workers[i].start();
			}
		for(int i = 0; i < children; ++i)
			try {
				workers[i].join();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
