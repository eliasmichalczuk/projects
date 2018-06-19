package threadExercicio;
public class Buffer {
	private int valor;
	private boolean cheio = false;
	
	public synchronized int get(){
		while(!cheio){
			try{
				wait();
			}catch(InterruptedException e){
			}
		}
		
		cheio = false;
		notifyAll();
		
		return valor;
	}
	
	public synchronized void put(int valor){
		while(cheio){
			try{
				wait();
			}catch(InterruptedException e){
			}
		}
		
		this.valor = valor;
		cheio = true;
		
		notifyAll();
	}
	
	public static void main(String[] args) {
		Buffer buf = new Buffer();
		
		Consumidor c = new Consumidor(buf);
		Produtor   p = new Produtor(buf);
		
		c.start();
		p.start();
	}
}
