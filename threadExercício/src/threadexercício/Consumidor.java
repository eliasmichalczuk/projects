package threadExercicio;
public class Consumidor extends Thread {
	private Buffer buf;
	
	public Consumidor (Buffer buf) {
		this.buf = buf;
	}

	public void run(){
		int x;
		for (int i=0;i<10;i++){
			x=buf.get();
			System.out.println("Consumi: " + x);
		}
	}
}
