package threadExercicio;
public class Produtor extends Thread{
	private Buffer buf;
	
	public Produtor (Buffer buf){
		this.buf = buf;
	}

	public void run() {
		for (int i=0;i<10;i++){
			System.out.println("Adicionei " + i);
			buf.put(i);
			
			try{
				Thread.sleep((int)(Math.random()*100));
			}catch(Exception e) {
			}
		}
	}
}
