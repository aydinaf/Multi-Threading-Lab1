public class Driver {
	public static void main(String[] args){
		Parent p = new Parent();
		p.children = 10;
		p.range = 3;
		p.start();
		
		try {
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
